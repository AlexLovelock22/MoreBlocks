package alexlovelock22.github.io.list;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class FoodList {
    public static final FoodComponent BANANA_COMPONENT = new FoodComponent.Builder()
            .nutrition(5)
            .saturationModifier(4)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 20 * 30, 1), 1)
            .build();
}
