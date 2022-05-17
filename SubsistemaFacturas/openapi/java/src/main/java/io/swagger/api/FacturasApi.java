/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.34).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Factura;
import io.swagger.model.HTTPProblem;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-08T20:36:10.229245+02:00[Europe/Madrid]")
@Validated
public interface FacturasApi {

    @Operation(summary = "Devuelve todas las facturas existentes", description = "Devuelve todas las facturas existentes del sistema", tags={ "Facturas" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Array de facturas", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))),
        
        @ApiResponse(responseCode = "400", description = "BAD REQUEST", content = @Content(mediaType = "application/problem+json", schema = @Schema(implementation = HTTPProblem.class))),
        
        @ApiResponse(responseCode = "404", description = "NOT FOUND", content = @Content(mediaType = "application/problem+json", schema = @Schema(implementation = HTTPProblem.class))),
        
        @ApiResponse(responseCode = "500", description = "The server encountered an unexpected condition that prevented it from fulfilling the request. ", content = @Content(mediaType = "application/problem+json", schema = @Schema(implementation = HTTPProblem.class))) })
    @RequestMapping(value = "/facturas",
        produces = { "application/json", "application/problem+json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Object> apiFacturasCget();


    @Operation(summary = "Provides the list of HTTP supported methods.", description = "Return a `Allow` header with a comma separated list of HTTP supported methods.", tags={ "Facturas" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "`Allow` header &lt;Response body is empty&gt;") })
    @RequestMapping(value = "/facturas",
        method = RequestMethod.OPTIONS)
    ResponseEntity<Void> apiFacturasCoptions();


    @Operation(summary = "Elimina el recurso Factura.", description = "Elimina el recurso Factura tras especificar su `id factura`.", tags={ "Facturas" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Factura deleted &lt;Response body is empty&gt;"),
        
        @ApiResponse(responseCode = "404", description = "NOT FOUND", content = @Content(mediaType = "application/problem+json", schema = @Schema(implementation = HTTPProblem.class))),
        
        @ApiResponse(responseCode = "412", description = "PRECONDITION FAILED", content = @Content(mediaType = "application/problem+json", schema = @Schema(implementation = HTTPProblem.class))),
        
        @ApiResponse(responseCode = "413", description = "PAYLOAD TOO LARGE", content = @Content(mediaType = "application/problem+json", schema = @Schema(implementation = HTTPProblem.class))),
        
        @ApiResponse(responseCode = "422", description = "The server understands the content type of the request entity (hence a 415 Unsupported Media Type status code is inappropriate), and the syntax of the request entity is correct (thus a 400 Bad Request status code is inappropriate) but was unable to process the contained instructions. ", content = @Content(mediaType = "application/problem+json", schema = @Schema(implementation = HTTPProblem.class))),
        
        @ApiResponse(responseCode = "500", description = "The server encountered an unexpected condition that prevented it from fulfilling the request. ", content = @Content(mediaType = "application/problem+json", schema = @Schema(implementation = HTTPProblem.class))) })
    @RequestMapping(value = "/facturas/{id}",
        produces = { "application/problem+json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> apiFacturasDelete(@Pattern(regexp="^\\d+$") @Parameter(in = ParameterIn.PATH, description = "**ID**.   ID de la factura.   La API responde con la factura. type: number format: uuid", required=true, schema=@Schema()) @PathVariable("id") Integer id);


    @Operation(summary = "Devuelve una factura tras especificar su ID.", description = "Devuelve una factura tras especificar su `ID`.", tags={ "Facturas" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Devolvemos una factura detallada", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Factura.class))),
        
        @ApiResponse(responseCode = "404", description = "NOT FOUND", content = @Content(mediaType = "application/problem+json", schema = @Schema(implementation = HTTPProblem.class))),
        
        @ApiResponse(responseCode = "412", description = "PRECONDITION FAILED", content = @Content(mediaType = "application/problem+json", schema = @Schema(implementation = HTTPProblem.class))),
        
        @ApiResponse(responseCode = "500", description = "The server encountered an unexpected condition that prevented it from fulfilling the request. ", content = @Content(mediaType = "application/problem+json", schema = @Schema(implementation = HTTPProblem.class))) })
    @RequestMapping(value = "/facturas/{id}",
        produces = { "application/json", "application/problem+json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Factura> apiFacturasGet(@Pattern(regexp="^\\d+$") @Parameter(in = ParameterIn.PATH, description = "**ID**.   ID de la factura.   La API responde con la factura. type: number format: uuid", required=true, schema=@Schema()) @PathVariable("id") Integer id);


    @Operation(summary = "Provides the list of HTTP supported methods.", description = "Return a `Allow` header with a comma separated list of HTTP supported methods.", tags={ "Facturas" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "`Allow` header &lt;Response body is empty&gt;") })
    @RequestMapping(value = "/facturas/{id}",
        method = RequestMethod.OPTIONS)
    ResponseEntity<Void> apiFacturasOptionsId(@Pattern(regexp="^\\d+$") @Parameter(in = ParameterIn.PATH, description = "**ID**.   ID de la factura.   La API responde con la factura. type: number format: uuid", required=true, schema=@Schema()) @PathVariable("id") Integer id);


    @Operation(summary = "Crea una factura.", description = "Crea una nueva factura", tags={ "Facturas" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "`Created`: Factura creada"),
        
        @ApiResponse(responseCode = "400", description = "BAD REQUEST", content = @Content(mediaType = "application/problem+json", schema = @Schema(implementation = HTTPProblem.class))),
        
        @ApiResponse(responseCode = "412", description = "PRECONDITION FAILED", content = @Content(mediaType = "application/problem+json", schema = @Schema(implementation = HTTPProblem.class))),
        
        @ApiResponse(responseCode = "422", description = "The server understands the content type of the request entity (hence a 415 Unsupported Media Type status code is inappropriate), and the syntax of the request entity is correct (thus a 400 Bad Request status code is inappropriate) but was unable to process the contained instructions. ", content = @Content(mediaType = "application/problem+json", schema = @Schema(implementation = HTTPProblem.class))),
        
        @ApiResponse(responseCode = "500", description = "The server encountered an unexpected condition that prevented it from fulfilling the request. ", content = @Content(mediaType = "application/problem+json", schema = @Schema(implementation = HTTPProblem.class))) })
    @RequestMapping(value = "/facturas",
        produces = { "application/problem+json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> apiFacturasPost();


    @Operation(summary = "Actualiza una factura determinada especificando su identificador y los campos a actualizar", description = "Actualiza una factura determinada especificando su id.", tags={ "Facturas" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Factura", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Factura.class))),
        
        @ApiResponse(responseCode = "404", description = "NOT FOUND", content = @Content(mediaType = "application/problem+json", schema = @Schema(implementation = HTTPProblem.class))),
        
        @ApiResponse(responseCode = "412", description = "PRECONDITION FAILED", content = @Content(mediaType = "application/problem+json", schema = @Schema(implementation = HTTPProblem.class))),
        
        @ApiResponse(responseCode = "413", description = "PAYLOAD TOO LARGE", content = @Content(mediaType = "application/problem+json", schema = @Schema(implementation = HTTPProblem.class))),
        
        @ApiResponse(responseCode = "422", description = "The server understands the content type of the request entity (hence a 415 Unsupported Media Type status code is inappropriate), and the syntax of the request entity is correct (thus a 400 Bad Request status code is inappropriate) but was unable to process the contained instructions. ", content = @Content(mediaType = "application/problem+json", schema = @Schema(implementation = HTTPProblem.class))),
        
        @ApiResponse(responseCode = "500", description = "The server encountered an unexpected condition that prevented it from fulfilling the request. ", content = @Content(mediaType = "application/problem+json", schema = @Schema(implementation = HTTPProblem.class))) })
    @RequestMapping(value = "/facturas/{id}",
        produces = { "application/json", "application/problem+json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Factura> apiFacturasPut(@Pattern(regexp="^\\d+$") @Parameter(in = ParameterIn.PATH, description = "**ID**.   ID de la factura.   La API responde con la factura. type: number format: uuid", required=true, schema=@Schema()) @PathVariable("id") Integer id);

}

