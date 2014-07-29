package fisherman77.paleocraft.client;
import cpw.mods.fml.client.registry.RenderingRegistry;
import fisherman77.paleocraft.common.PaleocraftCommonProxy;
import fisherman77.paleocraft.common.mobs.EntityBaryonyx;
import fisherman77.paleocraft.common.mobs.EntityCitipati;
import fisherman77.paleocraft.common.mobs.EntityCompy;
import fisherman77.paleocraft.common.mobs.EntityDimorphodon;
import fisherman77.paleocraft.common.mobs.EntityDromaeosaurus;
import fisherman77.paleocraft.common.mobs.EntityMasso;
import fisherman77.paleocraft.common.mobs.EntityMegalodon;
import fisherman77.paleocraft.common.mobs.EntityQuetzalcoatlus;
import fisherman77.paleocraft.common.mobs.EntitySpino;
import fisherman77.paleocraft.common.mobs.EntityTroodon;
import fisherman77.paleocraft.common.mobs.EntityTylo;
import fisherman77.paleocraft.common.mobs.ModelBaryonyx;
import fisherman77.paleocraft.common.mobs.ModelCitipati;
import fisherman77.paleocraft.common.mobs.ModelCompsognathus;
import fisherman77.paleocraft.common.mobs.ModelDimorphodon;
import fisherman77.paleocraft.common.mobs.ModelDromaeosaurus;
import fisherman77.paleocraft.common.mobs.ModelMassospondylus;
import fisherman77.paleocraft.common.mobs.ModelMegalodon;
import fisherman77.paleocraft.common.mobs.ModelQuetzalcoatlus;
import fisherman77.paleocraft.common.mobs.ModelSpino;
import fisherman77.paleocraft.common.mobs.ModelTroodon;
import fisherman77.paleocraft.common.mobs.ModelTylo;
import fisherman77.paleocraft.common.mobs.RenderBaryonyx;
import fisherman77.paleocraft.common.mobs.RenderCitipati;
import fisherman77.paleocraft.common.mobs.RenderCompy;
import fisherman77.paleocraft.common.mobs.RenderDimorphodon;
import fisherman77.paleocraft.common.mobs.RenderDromaeosaurus;
import fisherman77.paleocraft.common.mobs.RenderMasso;
import fisherman77.paleocraft.common.mobs.RenderMegalodon;
import fisherman77.paleocraft.common.mobs.RenderQuetzalcoatlus;
import fisherman77.paleocraft.common.mobs.RenderSpino;
import fisherman77.paleocraft.common.mobs.RenderTroodon;
import fisherman77.paleocraft.common.mobs.RenderTylo;
import net.minecraftforge.client.MinecraftForgeClient;
public class PaleocraftClientProxy extends PaleocraftCommonProxy {
        
	public void registerRenderInformation() {
	
}

public void registerRenderers(){
	float shadowSize = 0.5F;
	RenderingRegistry.registerEntityRenderingHandler(EntityQuetzalcoatlus.class, new RenderQuetzalcoatlus(new ModelQuetzalcoatlus(), shadowSize));
	RenderingRegistry.registerEntityRenderingHandler(EntityBaryonyx.class, new RenderBaryonyx(new ModelBaryonyx(), shadowSize, 2.5F));
	RenderingRegistry.registerEntityRenderingHandler(EntityCitipati.class, new RenderCitipati(new ModelCitipati(), shadowSize));
	RenderingRegistry.registerEntityRenderingHandler(EntityCompy.class, new RenderCompy(new ModelCompsognathus(), shadowSize, 0.5F));
	RenderingRegistry.registerEntityRenderingHandler(EntityDimorphodon.class, new RenderDimorphodon(new ModelDimorphodon(), shadowSize, 0.25F));
	RenderingRegistry.registerEntityRenderingHandler(EntityDromaeosaurus.class, new RenderDromaeosaurus(new ModelDromaeosaurus(), shadowSize));
	RenderingRegistry.registerEntityRenderingHandler(EntityMasso.class, new RenderMasso(new ModelMassospondylus(), shadowSize));
	RenderingRegistry.registerEntityRenderingHandler(EntityMegalodon.class, new RenderMegalodon(new ModelMegalodon(), shadowSize, 3.75F));
	RenderingRegistry.registerEntityRenderingHandler(EntitySpino.class, new RenderSpino(new ModelSpino(), shadowSize, 3.0F));
	RenderingRegistry.registerEntityRenderingHandler(EntityTroodon.class, new RenderTroodon(new ModelTroodon(), shadowSize));
	RenderingRegistry.registerEntityRenderingHandler(EntityTylo.class, new RenderTylo(new ModelTylo(), shadowSize, 2.5F));
}

}
