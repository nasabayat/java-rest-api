package de.naserbayat.restapispk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc

public class RestApiSpkApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void noParamSpkDomainRoleShouldReturnDefaultMessage() throws Exception {
		this.mockMvc.perform(get("/spkdomainrole")).andDo(print()).andExpect(status().isOk())
				.andExpect(jsonPath("$.deviceId").value("3"))
				.andExpect(jsonPath("$.domain").value("A"))
				.andExpect(jsonPath("$.role").value("Bing"));
	}

	@Test
	public void paramSpkDomainRoleShouldReturnTailoredMessage() throws Exception {
		this.mockMvc.perform(get("/spkdomainrole").param("deviceId","3"))
				.andDo(print()).andExpect(status().isOk())
				.andExpect(jsonPath("$.domain").value("A"))
				.andExpect(jsonPath(".role").value("Bing"));
	}

}
