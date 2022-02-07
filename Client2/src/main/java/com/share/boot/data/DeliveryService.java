package com.share.boot.data;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@RefreshScope
@Service
public class DeliveryService {
	public String getMenu(String id) {
        switch (id) {
        	case "1":
        		return "커피";
	        case "2":
	        	return "짜장면";
	        default:
	        	return "치킨";
	        }
	    }
}
