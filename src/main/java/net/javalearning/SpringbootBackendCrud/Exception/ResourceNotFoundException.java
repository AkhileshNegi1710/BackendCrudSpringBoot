package net.javalearning.SpringbootBackendCrud.Exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


//Rest API will throw this exception so directly using in this class without defining in the API class/Controller class
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String message)
    {
        super(message);

    }

}
