package africa.semicolon.lumexpress.Config;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LumExpressConfig {
    @Value("${cloudinary.api.name}")
    private String cloudName;

    @Value("${cloudinary.api.key}")
    private String cloudKey;

    @Value("${cloudinary.api.secret}")
    private String cloudSecret;

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
    @Bean
    public Cloudinary cloudinary (){
        return new Cloudinary(ObjectUtils.asMap("cloud_name",cloudName,
                "api_key",cloudKey,
                "api_secret",cloudSecret,
                "secure",true));
    }
}
