package bladeking68.paleocraft.Biomes;





import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerBiomesPaleocraft extends GenLayer {

protected BiomeGenBase[] allowedBiomes = {fisherman77.paleocraft.common.Paleocraft.Paleoplains, fisherman77.paleocraft.common.Paleocraft.Paleodesert, fisherman77.paleocraft.common.Paleocraft.Paleoforest, fisherman77.paleocraft.common.Paleocraft.Paleosea, fisherman77.paleocraft.common.Paleocraft.Paleoswamp};

public GenLayerBiomesPaleocraft(long seed, GenLayer genlayer) {
super(seed);
this.parent = genlayer;
}

public GenLayerBiomesPaleocraft(long seed) {
super(seed);
}

@Override
public int[] getInts(int x, int z, int width, int depth)
{
int[] dest = IntCache.getIntCache(width*depth);

for (int dz=0; dz<depth; dz++)
{
for (int dx=0; dx<width; dx++)
{
this.initChunkSeed(dx+x, dz+z);
dest[(dx+dz*width)] = this.allowedBiomes[nextInt(this.allowedBiomes.length)].biomeID;
}
}
return dest;
}
}
