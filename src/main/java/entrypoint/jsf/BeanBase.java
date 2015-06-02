/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrypoint.jsf;

import java.io.InputStream;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

/**
 *
 * @author b7godin
 */
public abstract class BeanBase implements Serializable {

    private static String PROGRAMTIC_RESOURCE_PATH_TO_LABRADOR_IMG = "resources/img/blackLabrador.jpg";
    private static String PROGRAMTIC_PATH_TO_ASK_FOR_MIME_TYPE = "img/blackLabrador.jpg";

    @Inject
    private transient FacesContext facesContext;

    private transient StreamedContent streamedContent;

    private transient StreamedContent streamedContentB;

    @PostConstruct
    private void postConstruct() {
        String mimeType = facesContext.getExternalContext().getMimeType(PROGRAMTIC_PATH_TO_ASK_FOR_MIME_TYPE);
        InputStream inputStream = facesContext.getExternalContext().getResourceAsStream(
                PROGRAMTIC_RESOURCE_PATH_TO_LABRADOR_IMG);
        InputStream inputStreamB = facesContext.getExternalContext().getResourceAsStream(
                PROGRAMTIC_RESOURCE_PATH_TO_LABRADOR_IMG);
        streamedContent = new DefaultStreamedContent(inputStream, mimeType);
        streamedContentB = new DefaultStreamedContent(inputStreamB, mimeType);
    }

    public String getPing() {
        return "ping";
    }

    public String getImageResource() {
        return "img/blackLabrador.jpg";
    }

    /**
     * Get Streamed content
     */
    public StreamedContent getStreamedContent() {
        return streamedContent;
    }

    /**
     * Get Streamed content
     */
    public StreamedContent getStreamedContentB() {
        return streamedContentB;
    }
}
