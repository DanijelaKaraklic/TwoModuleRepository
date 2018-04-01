package com.karaklic.controller;

import com.karaklic.dto.AddressComponentsDto;
import com.karaklic.dto.SupplierDto;
import com.karaklic.dto.UpdateProductRequest;
import com.karaklic.model.AddressComponents;
import com.karaklic.model.Product;
import com.karaklic.model.Supplier;
import com.karaklic.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    private static final ModelMapper mapper = new ModelMapper();

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public void updateProduct(@PathVariable("id") Integer id, @RequestBody @Valid UpdateProductRequest updateProductRequest){
        Product product = productService.findById(id);
        String name = updateProductRequest.getName();
        product.setName(name);
        double latitude = updateProductRequest.getLatitude();
        product.setLatitude(latitude);
        double longitude = updateProductRequest.getLongitude();
        product.setLongitude(longitude);
        String phone = updateProductRequest.getPhone();
        product.setPhone(phone);
        String currrency = updateProductRequest.getCurrency();
        product.setCurrency(currrency);
        AddressComponentsDto addressComponentsDto = updateProductRequest.getAddressComponentsDto();
        AddressComponents addressComponents = mapper.map(addressComponentsDto,AddressComponents.class);
        product.setAddressComponents(addressComponents);
        SupplierDto supplierDto = updateProductRequest.getSupplierDto();
        Supplier supplier = mapper.map(supplierDto,Supplier.class);
        product.setSupplier(supplier);
        productService.save(product);
    }

   /* @RequestMapping(value = "/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<Listing> getProductById(@PathVariable("id") Integer id) {
        Product product = productService.findById(id);
        ObjectFactory objectFactory = new ObjectFactory();
        Listing listing = objectFactory.createListing();
        listing.setId(String.valueOf(product.getId()));
        Name name = new Name();
        name.setValue(product.getName());
        listing.getName().add(name);
        Address address = new Address();
        address.getContent().add(product.getAddressComponents());
        listing.getAddress().add(address);
        listing.setCountry(product.getAddressComponents().getCountry());
        listing.setLatitude(Float.valueOf(String.valueOf(product.getLatitude())));
        listing.setLongitude(Float.valueOf(String.valueOf(product.getLongitude())));
        Phone phone = new Phone();
        phone.setType(product.getPhone());
        listing.getPhone().add(phone);
        List<Object> images = new ArrayList<>();
        product.getImages().forEach(image -> {Image img = new Image();
            img.setType(image.getName());
            img.setUrl(image.getUrl());
            images.add(img);});
        Content content = new Content();
        content.setTextOrReviewOrImage(images);
        listing.setContent(content);
        Calendar now = Calendar.getInstance();
        long year = now.get(Calendar.YEAR);
        long month = now.get(Calendar.MONTH) + 1;
        long day = now.get(Calendar.DAY_OF_MONTH);
        Date date = new Date();
        date.setYear(year);
        date.setDay(day);
        date.setMonth(month);
        listing.setDate(date);
        return new ResponseEntity<Listing>(listing, HttpStatus.OK);
    }*/

}
