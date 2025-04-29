package org.joinfaces.example;

import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.convert.FacesConverter;
import org.springframework.stereotype.Component;

@FacesConverter("sampleConverter")
@Component
public class SampleConverter implements Converter<Object> {
    private final DummyBean dummyBean;

    public SampleConverter(DummyBean dummyBean) {
        this.dummyBean = dummyBean;
    }

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return dummyBean.getText();
    }
}
