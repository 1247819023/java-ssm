package com.lgj.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lgj.dao.PAuthorMapper;
import com.lgj.dao.PPostMapper;
import com.lgj.entity.PAuthor;
import com.lgj.entity.PPost;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/")
public class PostController {

    @Autowired
    private PPostMapper pPostMapper;

    @Autowired
    private PAuthorMapper pAuthorMapper;

    @RequestMapping(method = RequestMethod.GET)
    public String post(@RequestParam(defaultValue = "1") int page, Model model) {
        PageHelper.startPage(page, 2);
        List<PPost> pPostList = pPostMapper.selectAll();
        List<PAuthor> pAuthors = pAuthorMapper.selectAll();
        model.addAttribute("pPostList", pPostList);
        model.addAttribute("pAuthors", pAuthors);
        model.addAttribute("pageInfo", new PageInfo<>(pPostList));

        return "post";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String add(PPost pPost) {
        pPostMapper.insert(pPost);

        return "redirect:/";
    }

    @RequestMapping(value = "/del/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable("id") int id) {
        pPostMapper.deleteByPrimaryKey(id);

        return "redirect:/";
    }

    @RequestMapping("/a")
    public String handleRequest(Model model,PPost pPost){
        System.out.println("处理过程");
        model.addAttribute("post_caption","post_content");
        return "post";
    }
}
