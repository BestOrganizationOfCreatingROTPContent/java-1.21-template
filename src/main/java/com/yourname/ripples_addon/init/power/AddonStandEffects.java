package com.yourname.ripples_addon.init.power;

import com.github.standobyte.jojo.core.JojoRegistries;

import com.github.standobyte.jojo.entityattachment.custom_effect.EntityCustomEffectType;
import com.yourname.ripples_addon.RipplesAddon;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class AddonStandEffects {
	public static final DeferredRegister<EntityCustomEffectType<?>> STAND_EFFECT_TYPES = DeferredRegister.create(JojoRegistries.STAND_EFFECTS_REG, RipplesAddon.MOD_ID);

	/* Example:
		public static final DeferredHolder<EntityCustomEffectType<?>, EntityCustomEffectType<ActDataStandEffect>> ACT_DATA = STAND_EFFECT_TYPES.register(
            "act_data", key -> new EntityCustomEffectType<>(key, ActDataStandEffect::new));
	 */
}