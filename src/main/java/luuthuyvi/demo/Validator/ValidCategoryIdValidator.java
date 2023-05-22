package luuthuyvi.demo.Validator;

import luuthuyvi.demo.Validator.annotation.ValidCategoryId;
import luuthuyvi.demo.entity.Category;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category> {
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext context){
        return  category != null && category.getId() != null;
    }
}
