package deob;

@ObfuscatedName("wm")
public class class587 extends class588 {

	@ObfuscatedName("wm.af")
	public final int[][] field5895;

	@ObfuscatedName("wm.aw")
	public final int[][] field5893;

	@ObfuscatedName("wm.at")
	public final int[] field5894;

	@ObfuscatedName("wm.ac")
	public final int[] field5897;

	@ObfuscatedName("wm.ap")
	public final class450[] field5896;

	@ObfuscatedName("wm.aq")
	public final class450[] field5892;

	@ObfuscatedName("wm.ao")
	public final class450[] field5898;

	public class587(int arg0, int arg1, int arg2, int arg3) {
		this(arg0, arg1, arg2, arg3, 2359552, 0);
	}

	public class587(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.field5895 = new int[16][4];
		this.field5893 = new int[16][4];
		this.field5894 = new int[16];
		this.field5897 = new int[16];
		this.field5896 = new class450[16];
		this.field5892 = new class450[16];
		this.field5898 = new class450[16];
		for (int var7 = 0; var7 < 16; var7++) {
			int var8 = var7 * 128;
			int var9 = class537.field5572[var8 & 0x7FF];
			int var11 = class537.field5575[var8 & 0x7FF];
			int var13 = -(arg2 * var9 - arg3 * var11 >> 16);
			int var14 = arg2 * var11 + arg3 * var9 >> 16;
			int var15 = this.field5901 * var9 - this.field5902 * var11 >> 16;
			int var16 = this.field5902 * var9 + this.field5901 * var11 >> 16;
			int var17 = this.field5902 * var11 + this.field5901 * var9 >> 16;
			int var18 = this.field5902 * var9 - this.field5901 * var11 >> 16;
			this.field5895[var7] = new int[4];
			this.field5893[var7] = new int[4];
			this.field5895[var7][0] = var13 - var15;
			this.field5893[var7][0] = var14 + var16;
			this.field5895[var7][1] = var13 + var17;
			this.field5893[var7][1] = var14 + var18;
			this.field5895[var7][2] = var13 + var15;
			this.field5893[var7][2] = var14 - var16;
			this.field5895[var7][3] = var13 - var17;
			this.field5893[var7][3] = var14 - var18;
			this.field5894[var7] = Math.abs(this.field5902 * var11) >> 16;
			this.field5897[var7] = Math.abs(this.field5902 * var9) >> 16;
			int var19 = Math.min(this.field5895[var7][0], Math.min(this.field5895[var7][1], Math.min(this.field5895[var7][2], this.field5895[var7][3])));
			int var20 = Math.max(this.field5895[var7][0], Math.max(this.field5895[var7][1], Math.max(this.field5895[var7][2], this.field5895[var7][3])));
			int var21 = Math.min(this.field5893[var7][0], Math.min(this.field5893[var7][1], Math.min(this.field5893[var7][2], this.field5893[var7][3])));
			int var22 = Math.max(this.field5893[var7][0], Math.max(this.field5893[var7][1], Math.max(this.field5893[var7][2], this.field5893[var7][3])));
			this.field5896[var7] = new class450(var19, var21, var20 - var19, var22 - var21);
			int var23 = Math.min(this.field5895[var7][2], Math.min(this.field5895[var7][3], var13));
			int var24 = Math.max(this.field5895[var7][2], Math.max(this.field5895[var7][3], var13));
			int var25 = Math.min(this.field5893[var7][2], Math.min(this.field5893[var7][3], var14));
			int var26 = Math.max(this.field5893[var7][2], Math.max(this.field5893[var7][3], var14));
			this.field5892[var7] = new class450(var23, var25, var24 - var23, var26 - var25);
			int var27 = Math.min(this.field5895[var7][0], Math.min(this.field5895[var7][1], var13));
			int var28 = Math.max(this.field5895[var7][0], Math.max(this.field5895[var7][1], var13));
			int var29 = Math.min(this.field5893[var7][0], Math.min(this.field5893[var7][1], var14));
			int var30 = Math.max(this.field5893[var7][0], Math.max(this.field5893[var7][1], var14));
			this.field5898[var7] = new class450(var27, var29, var28 - var27, var30 - var29);
		}
	}
}
