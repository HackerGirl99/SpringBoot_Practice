package lk.vau.fas.dps.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.vau.fas.dps.Model.Postgraduate;
import lk.vau.fas.dps.Service.PostgraduateService;

@RestController
@RequestMapping("/post_graduate")
public class PostgraduateController extends GenericController<Postgraduate, String>{
	@Autowired
	private PostgraduateService service;
}
