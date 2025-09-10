package deob;

@ObfuscatedName("mx")
public class class338 implements class431 {

	@ObfuscatedName("mx.af")
	public static final class338 field3854 = new class338(0, 0);

	@ObfuscatedName("mx.aw")
	public static final class338 field3848 = new class338(1, 1);

	@ObfuscatedName("mx.at")
	public static final class338 field3849 = new class338(2, 2);

	@ObfuscatedName("mx.ac")
	public static final class338 field3850 = new class338(3, 3);

	@ObfuscatedName("mx.ap")
	public static final class338 field3851 = new class338(4, 4);

	@ObfuscatedName("mx.aq")
	public static final class338 field3852 = new class338(5, 5);

	@ObfuscatedName("mx.ao")
	public static final class338 field3853 = new class338(6, 6);

	@ObfuscatedName("mx.as")
	public static final class338 field3871 = new class338(7, 7);

	@ObfuscatedName("mx.al")
	public static final class338 field3855 = new class338(8, 8);

	@ObfuscatedName("mx.au")
	public static final class338 field3869 = new class338(9, 9);

	@ObfuscatedName("mx.ai")
	public static final class338 field3857 = new class338(10, 10);

	@ObfuscatedName("mx.aa")
	public static final class338 field3858 = new class338(11, 11);

	@ObfuscatedName("mx.am")
	public static final class338 field3859 = new class338(12, 12);

	@ObfuscatedName("mx.an")
	public static final class338 field3856 = new class338(13, 13);

	@ObfuscatedName("mx.ar")
	public static final class338 field3860 = new class338(14, 14);

	@ObfuscatedName("mx.ae")
	public static final class338 field3862 = new class338(15, 15);

	@ObfuscatedName("mx.ay")
	public static final class338 field3863 = new class338(16, 16);

	@ObfuscatedName("mx.ad")
	public static final class338 field3864 = new class338(17, 17);

	@ObfuscatedName("mx.ag")
	public static final class338 field3868 = new class338(18, 18);

	@ObfuscatedName("mx.av")
	public static final class338 field3878 = new class338(19, 19);

	@ObfuscatedName("mx.ah")
	public static final class338 field3865 = new class338(20, 20);

	@ObfuscatedName("mx.ab")
	public static final class338 field3874 = new class338(21, 21);

	@ObfuscatedName("mx.ax")
	public static final class338 field3876 = new class338(22, 22);

	@ObfuscatedName("mx.ak")
	public static final class338 field3870 = new class338(23, 23);

	@ObfuscatedName("mx.aj")
	public static final class338 field3872 = new class338(24, 24);

	@ObfuscatedName("mx.az")
	public static final class338 field3847 = new class338(25, 25);

	@ObfuscatedName("mx.bt")
	public static final class338 field3873 = new class338(26, 26);

	@ObfuscatedName("mx.bs")
	public static final class338 field3867 = new class338(27, 27);

	@ObfuscatedName("mx.bu")
	public final int field3875;

	@ObfuscatedName("mx.bi")
	public static final class338[] field3861;

	@ObfuscatedName("mx.bd")
	public final int field3877;

	static {
		class338[] var0 = new class338[] { field3854, field3848, field3849, field3850, field3851, field3852, field3853, field3871, field3855, field3869, field3857, field3858, field3859, field3856, field3860, field3862, field3863, field3864, field3868, field3878, field3865, field3874, field3876, field3870, field3872, field3847, field3873, field3867 };
		field3861 = new class338[var0.length];
		class338[] var2 = var0;
		for (int var3 = 0; var3 < var2.length; var3++) {
			class338 var4 = var2[var3];
			field3861[var4.field3877] = var4;
		}
	}

	public class338(int arg0, int arg1) {
		this.field3875 = arg0;
		this.field3877 = arg1;
	}

	@ObfuscatedName("kf.at(JJLmx;I)D")
	public static double method5562(long arg0, long arg1, class338 arg2) {
		float var7;
		if (arg1 > 0L) {
			float var5 = (float) arg0 / (float) arg1;
			float var6 = Math.max(0.0F, Math.min(var5, 1.0F));
			var7 = var6;
		} else {
			var7 = 1.0F;
		}
		double var8 = (double) var7;
		if (var8 <= 0.0D || var8 >= 1.0D) {
			return var8 <= 0.0D ? 0.0D : 1.0D;
		}
		switch(arg2.field3875) {
			case 0:
			default:
				return var8;
			case 1:
				return 1.0D - Math.cos(var8 * 3.141592653589793D / 2.0D);
			case 2:
				return Math.sin(var8 * 3.141592653589793D / 2.0D);
			case 3:
				return -(Math.cos(var8 * 3.141592653589793D) - 1.0D) / 2.0D;
			case 4:
				return var8 * var8;
			case 5:
				return 1.0D - (1.0D - var8) * (1.0D - var8);
			case 6:
				return var8 < 0.5D ? var8 * 2.0D * var8 : 1.0D - Math.pow(var8 * -2.0D + 2.0D, 2.0D) / 2.0D;
			case 7:
				return var8 * var8 * var8;
			case 8:
				return 1.0D - Math.pow(1.0D - var8, 3.0D);
			case 9:
				return var8 < 0.5D ? var8 * 4.0D * var8 * var8 : 1.0D - Math.pow(var8 * -2.0D + 2.0D, 3.0D) / 2.0D;
			case 10:
				return var8 * var8 * var8 * var8;
			case 11:
				return 1.0D - Math.pow(1.0D - var8, 4.0D);
			case 12:
				return var8 < 0.5D ? var8 * 8.0D * var8 * var8 * var8 : 1.0D - Math.pow(var8 * -2.0D + 2.0D, 4.0D) / 2.0D;
			case 13:
				return var8 * var8 * var8 * var8 * var8;
			case 14:
				return 1.0D - Math.pow(1.0D - var8, 5.0D);
			case 15:
				return var8 < 0.5D ? var8 * 8.0D * var8 * var8 * var8 * var8 : 1.0D - Math.pow(var8 * -2.0D + 2.0D, 5.0D) / 2.0D;
			case 16:
				return Math.pow(2.0D, var8 * 10.0D - 10.0D);
			case 17:
				return 1.0D - Math.pow(2.0D, var8 * -10.0D);
			case 18:
				return var8 < 0.5D ? Math.pow(2.0D, var8 * 20.0D + 10.0D) / 2.0D : (2.0D - Math.pow(2.0D, var8 * -20.0D + 10.0D)) / 2.0D;
			case 19:
				return 1.0D - Math.sqrt(1.0D - Math.pow(var8, 2.0D));
			case 20:
				return Math.sqrt(1.0D - Math.pow(var8 - 1.0D, 2.0D));
			case 21:
				return var8 < 0.5D ? (1.0D - Math.sqrt(1.0D - Math.pow(var8 * 2.0D, 2.0D))) / 2.0D : (Math.sqrt(1.0D - Math.pow(var8 * -2.0D + 2.0D, 2.0D)) + 1.0D) / 2.0D;
			case 22:
				double var26 = 1.70158D;
				double var28 = 2.70158D;
				return var8 * 2.70158D * var8 * var8 - var8 * 1.70158D * var8;
			case 23:
				double var22 = 1.70158D;
				double var24 = 2.70158D;
				return Math.pow(var8 - 1.0D, 3.0D) * 2.70158D + 1.0D + Math.pow(var8 - 1.0D, 2.0D) * 1.70158D;
			case 24:
				double var18 = 1.70158D;
				double var20 = 2.5949095D;
				return var8 < 0.5D ? Math.pow(var8 * 2.0D, 2.0D) * (var8 * 7.189819D - 2.5949095D) / 2.0D : (Math.pow(var8 * 2.0D - 2.0D, 2.0D) * ((var8 * 2.0D - 2.0D) * 3.5949095D + 2.5949095D) + 2.0D) / 2.0D;
			case 25:
				double var16 = 2.0943951023931953D;
				return -Math.pow(2.0D, var8 * 10.0D - 10.0D) * Math.sin((var8 * 10.0D - 10.75D) * 2.0943951023931953D);
			case 26:
				double var14 = 2.0943951023931953D;
				return Math.pow(2.0D, var8 * -10.0D) * Math.sin((var8 * 10.0D - 0.75D) * 2.0943951023931953D) + 1.0D;
			case 27:
				double var10 = 1.3962634015954636D;
				double var12 = Math.sin((var8 * 20.0D - 11.125D) * 1.3962634015954636D);
				return var8 < 0.5D ? -(Math.pow(2.0D, var8 * 20.0D - 10.0D) * var12) / 2.0D : Math.pow(2.0D, var8 * -20.0D + 10.0D) * var12 / 2.0D + 1.0D;
		}
	}

	@ObfuscatedName("mx.af(I)I")
	public int method34() {
		return this.field3877;
	}
}
