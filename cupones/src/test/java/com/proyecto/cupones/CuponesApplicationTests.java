package com.proyecto.cupones;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@AutoConfigureMockMvc
@SpringBootTest
class CuponesApplicationTests {
	@Autowired
	MockMvc mock;

	@Test
	@Order(1)
	void testAltausuario() throws Exception {
		mock.perform(post("/api/usuario")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\n"
						+ "        \"nombre\": \"Laura4\",\n"
						+ "        \"apellido_paterno\": \"Rios\",\n"
						+ "        \"apellido_materno\": \"Lagos\",\n"
						+ "        \"correo\": \"laura4@hotmail.com\",\n"
						+ "        \"contrasena\": \"12345\",\n"
						+ "        \"referido_por\": \"Juan\",\n"
						+ "        \"cuota\": 100.0\n"
						+ "    }")
				).andDo(print());
	}
	
	@Test
	@Order(2)
	void testListausuario() throws Exception {
		mock.perform(get("/api/usuarios")).andDo(print());
	}

}
