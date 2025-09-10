package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("vi")
public class class555 {

	@ObfuscatedName("vi.ao")
	public static final class557 field5682 = class557.field5745;

	@ObfuscatedName("vi.as")
	public static final class557 field5683 = class557.field5746;

	@ObfuscatedName("vi.al")
	public static final class557 field5684 = class557.field5747;

	@ObfuscatedName("vi.an")
	public final int[] field5686 = new int[] { 1008, 1009, 1010, 1011, 1012 };

	@ObfuscatedName("vi.ar")
	public boolean field5687 = false;

	@ObfuscatedName("vi.ae")
	public HashSet field5688 = new HashSet();

	@ObfuscatedName("vi.ay")
	public class413 field5689;

	@ObfuscatedName("vi.ad")
	public class413 field5723;

	@ObfuscatedName("vi.ag")
	public class413 field5690;

	@ObfuscatedName("vi.av")
	public class462 field5694;

	@ObfuscatedName("vi.ah")
	public HashMap field5693;

	@ObfuscatedName("vi.ab")
	public class605[] field5713;

	@ObfuscatedName("vi.ax")
	public HashMap field5695;

	@ObfuscatedName("vi.ak")
	public class290 field5696;

	@ObfuscatedName("vi.aj")
	public class290 field5679;

	@ObfuscatedName("vi.az")
	public class290 field5731;

	@ObfuscatedName("vi.bt")
	public class292 field5716;

	@ObfuscatedName("vi.bs")
	public class554 field5685;

	@ObfuscatedName("vi.bu")
	public int field5691;

	@ObfuscatedName("vi.bi")
	public int field5702;

	@ObfuscatedName("vi.bd")
	public int field5703 = -1;

	@ObfuscatedName("vi.ba")
	public int field5680 = -1;

	@ObfuscatedName("vi.bb")
	public float field5705;

	@ObfuscatedName("vi.bo")
	public float field5706;

	@ObfuscatedName("vi.bl")
	public int field5707 = -1;

	@ObfuscatedName("vi.by")
	public int field5697 = -1;

	@ObfuscatedName("vi.bg")
	public int field5709 = -1;

	@ObfuscatedName("vi.bx")
	public int field5710 = -1;

	@ObfuscatedName("vi.bq")
	public int field5711 = 3;

	@ObfuscatedName("vi.bz")
	public int field5708 = 50;

	@ObfuscatedName("vi.bn")
	public boolean field5724 = false;

	@ObfuscatedName("vi.be")
	public HashSet field5714 = null;

	@ObfuscatedName("vi.bh")
	public int field5715 = -1;

	@ObfuscatedName("vi.bk")
	public int field5712 = -1;

	@ObfuscatedName("vi.bp")
	public int field5717 = -1;

	@ObfuscatedName("vi.br")
	public int field5681 = -1;

	@ObfuscatedName("vi.bv")
	public int field5733 = -1;

	@ObfuscatedName("vi.bj")
	public int field5720 = -1;

	@ObfuscatedName("vi.bm")
	public long field5721;

	@ObfuscatedName("vi.bf")
	public int field5699;

	@ObfuscatedName("vi.bw")
	public int field5719;

	@ObfuscatedName("vi.bc")
	public boolean field5700 = true;

	@ObfuscatedName("vi.cw")
	public HashSet field5725 = new HashSet();

	@ObfuscatedName("vi.cz")
	public HashSet field5726 = new HashSet();

	@ObfuscatedName("vi.cf")
	public HashSet field5727 = new HashSet();

	@ObfuscatedName("vi.cg")
	public HashSet field5728 = new HashSet();

	@ObfuscatedName("vi.ci")
	public boolean field5729 = false;

	@ObfuscatedName("vi.cp")
	public int field5730 = 0;

	@ObfuscatedName("vi.cm")
	public List field5678;

	@ObfuscatedName("vi.cc")
	public Iterator field5732;

	@ObfuscatedName("vi.cj")
	public class357 field5722 = null;

	@ObfuscatedName("vi.ce")
	public class606 field5734;

	@ObfuscatedName("vi.cr")
	public int field5735;

	@ObfuscatedName("vi.cb")
	public int field5736 = -1;

	@ObfuscatedName("vi.cu")
	public int field5737 = -1;

	@ObfuscatedName("vi.cq")
	public int field5738 = -1;

	@ObfuscatedName("vi.af(Lpx;Lpx;Lpx;Lrv;Ljava/util/HashMap;[Lxc;I)V")
	public void method9821(class413 arg0, class413 arg1, class413 arg2, class462 arg3, HashMap arg4, class605[] arg5) {
		this.field5713 = arg5;
		this.field5689 = arg0;
		this.field5723 = arg1;
		this.field5690 = arg2;
		this.field5694 = arg3;
		this.field5693 = new HashMap();
		this.field5693.put(class287.field3299, arg4.get(field5682));
		this.field5693.put(class287.field3298, arg4.get(field5683));
		this.field5693.put(class287.field3300, arg4.get(field5684));
		this.field5685 = new class554(arg0);
		int var7 = this.field5689.method7715(class309.field3499.field3497);
		int[] var8 = this.field5689.method7708(var7);
		int var9 = var8 == null ? 0 : var8.length;
		this.field5695 = new HashMap(var9);
		for (int var10 = 0; var10 < var9; var10++) {
			class591 var11 = new class591(this.field5689.method7692(var7, var8[var10]));
			class290 var12 = new class290();
			var12.method5973(var11, var8[var10]);
			this.field5695.put(var12.method5982(), var12);
			if (var12.method5981()) {
				this.field5696 = var12;
			}
		}
		this.method9836(this.field5696);
		this.field5731 = null;
	}

	@ObfuscatedName("vi.aw(I)V")
	public void method9822() {
		class291.field3346.method6427(5);
	}

	@ObfuscatedName("vi.at(IIZIIIII)V")
	public void method9823(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
		if (!this.field5685.method9815()) {
			return;
		}
		this.method9908();
		this.method9827();
		if (!arg2) {
			return;
		}
		int var8 = (int) Math.ceil((double) ((float) arg5 / this.field5705));
		int var9 = (int) Math.ceil((double) ((float) arg6 / this.field5705));
		List var10 = this.field5716.method6203(this.field5691 - var8 / 2 - 1, this.field5702 - var9 / 2 - 1, var8 / 2 + this.field5691 + 1, var9 / 2 + this.field5702 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
		HashSet var11 = new HashSet();
		Iterator var12 = var10.iterator();
		while (var12.hasNext()) {
			class308 var13 = (class308) var12.next();
			var11.add(var13);
			class66 var14 = new class66();
			class313 var15 = new class313(var13.method5939(), var13.field3489, var13.field3492);
			var14.method2110(new Object[] { var15, arg0, arg1 });
			if (this.field5688.contains(var13)) {
				var14.method2102(17);
			} else {
				var14.method2102(15);
			}
			class47.method6482(var14);
		}
		Iterator var16 = this.field5688.iterator();
		while (var16.hasNext()) {
			class308 var17 = (class308) var16.next();
			if (!var11.contains(var17)) {
				class66 var18 = new class66();
				class313 var19 = new class313(var17.method5939(), var17.field3489, var17.field3492);
				var18.method2110(new Object[] { var19, arg0, arg1 });
				var18.method2102(16);
				class47.method6482(var18);
			}
		}
		this.field5688 = var11;
	}

	@ObfuscatedName("vi.ac(IIZZB)V")
	public void method9824(int arg0, int arg1, boolean arg2, boolean arg3) {
		long var5;
		label33: {
			var5 = class335.method3987();
			this.method9953(arg0, arg1, arg3, var5);
			if (!this.method9830() && (arg3 || arg2)) {
				boolean var7 = client.field613 != null;
				if (!var7) {
					if (arg3) {
						this.field5733 = arg0;
						this.field5720 = arg1;
						this.field5717 = this.field5691;
						this.field5681 = this.field5702;
					}
					if (this.field5717 != -1) {
						int var8 = arg0 - this.field5733;
						int var9 = arg1 - this.field5720;
						this.method9828(this.field5717 - (int) ((float) var8 / this.field5706), this.field5681 + (int) ((float) var9 / this.field5706), false);
					}
					break label33;
				}
			}
			this.method9829();
		}
		if (arg3) {
			this.field5721 = var5;
			this.field5699 = arg0;
			this.field5719 = arg1;
		}
	}

	@ObfuscatedName("vi.ap(IIZJ)V")
	public void method9953(int arg0, int arg1, boolean arg2, long arg3) {
		if (this.field5679 == null) {
			this.field5722 = null;
			return;
		}
		int var6 = (int) ((float) this.field5691 + ((float) (arg0 - this.field5709) - (float) this.method9858() * this.field5705 / 2.0F) / this.field5705);
		int var7 = (int) ((float) this.field5702 - ((float) (arg1 - this.field5710) - (float) this.method9906() * this.field5705 / 2.0F) / this.field5705);
		this.field5722 = this.field5679.method5978(var6 + this.field5679.method5986() * 64, var7 + this.field5679.method5988() * 64);
		if (this.field5722 == null || !arg2) {
			return;
		}
		class275 var8 = client.field552;
		boolean var10 = client.field429 >= 2;
		if (var10 && var8.method5701(82) && var8.method5701(81)) {
			client.method6280(this.field5722.field4027, this.field5722.field4026, this.field5722.field4028, false);
			return;
		}
		boolean var11 = true;
		if (this.field5700) {
			int var12 = arg0 - this.field5699;
			int var13 = arg1 - this.field5719;
			if (arg3 - this.field5721 > 500L || var12 < -25 || var12 > 25 || var13 < -25 || var13 > 25) {
				var11 = false;
			}
		}
		if (var11) {
			class330 var14 = class330.method3456(class328.field3549, client.field315.field1309);
			var14.field3665.method10547(this.field5722.method6811());
			client.field315.method2874(var14);
			this.field5721 = 0L;
		}
	}

	@ObfuscatedName("vi.aq(I)V")
	public void method9908() {
		if (Statics.field1781 != null) {
			this.field5705 = this.field5706;
			return;
		}
		if (this.field5705 < this.field5706) {
			this.field5705 = Math.min(this.field5706, this.field5705 / 30.0F + this.field5705);
		}
		if (this.field5705 > this.field5706) {
			this.field5705 = Math.max(this.field5706, this.field5705 - this.field5705 / 30.0F);
		}
	}

	@ObfuscatedName("vi.ao(I)V")
	public void method9827() {
		if (!this.method9830()) {
			return;
		}
		int var1 = this.field5703 - this.field5691;
		int var2 = this.field5680 - this.field5702;
		if (var1 != 0) {
			var1 /= Math.min(8, Math.abs(var1));
		}
		if (var2 != 0) {
			var2 /= Math.min(8, Math.abs(var2));
		}
		this.method9828(this.field5691 + var1, this.field5702 + var2, true);
		if (this.field5703 == this.field5691 && this.field5702 == this.field5680) {
			this.field5703 = -1;
			this.field5680 = -1;
		}
	}

	@ObfuscatedName("vi.as(IIZI)V")
	public final void method9828(int arg0, int arg1, boolean arg2) {
		this.field5691 = arg0;
		this.field5702 = arg1;
		class335.method3987();
		if (arg2) {
			this.method9829();
		}
	}

	@ObfuscatedName("vi.al(B)V")
	public final void method9829() {
		this.field5720 = -1;
		this.field5733 = -1;
		this.field5681 = -1;
		this.field5717 = -1;
	}

	@ObfuscatedName("vi.au(I)Z")
	public boolean method9830() {
		return this.field5703 != -1 && this.field5680 != -1;
	}

	@ObfuscatedName("vi.ai(IIII)Lll;")
	public class290 method9831(int arg0, int arg1, int arg2) {
		Iterator var4 = this.field5695.values().iterator();
		class290 var5;
		do {
			if (!var4.hasNext()) {
				return null;
			}
			var5 = (class290) var4.next();
		} while (!var5.method5975(arg0, arg1, arg2));
		return var5;
	}

	@ObfuscatedName("vi.aa(IIIZB)V")
	public void method9832(int arg0, int arg1, int arg2, boolean arg3) {
		class290 var5 = this.method9831(arg0, arg1, arg2);
		if (var5 == null) {
			if (!arg3) {
				return;
			}
			var5 = this.field5696;
		}
		boolean var6 = false;
		if (this.field5731 != var5 || arg3) {
			this.field5731 = var5;
			this.method9836(var5);
			var6 = true;
		}
		if (var6 || arg3) {
			this.method9839(arg0, arg1, arg2);
		}
	}

	@ObfuscatedName("vi.am(IB)V")
	public void method9833(int arg0) {
		class290 var2 = this.method9851(arg0);
		if (var2 != null) {
			this.method9836(var2);
		}
	}

	@ObfuscatedName("vi.an(B)I")
	public int method9834() {
		return this.field5679 == null ? -1 : this.field5679.method5991();
	}

	@ObfuscatedName("vi.ar(I)Lll;")
	public class290 method9825() {
		return this.field5679;
	}

	@ObfuscatedName("vi.ae(Lll;I)V")
	public void method9836(class290 arg0) {
		if (this.field5679 == null || this.field5679 != arg0) {
			this.method10015(arg0);
			this.method9839(-1, -1, -1);
		}
	}

	@ObfuscatedName("vi.ay(Lll;I)V")
	public void method10015(class290 arg0) {
		this.field5679 = arg0;
		this.field5716 = new class292(this.field5713, this.field5693, this.field5723, this.field5690);
		this.field5685.method9808(this.field5679 == null ? null : this.field5679.method5982());
	}

	@ObfuscatedName("vi.ad(Lll;Lna;Lna;ZI)V")
	public void method9983(class290 arg0, class357 arg1, class357 arg2, boolean arg3) {
		if (arg0 == null) {
			return;
		}
		if (this.field5679 == null || this.field5679 != arg0) {
			this.method10015(arg0);
		}
		if (!arg3 && this.field5679.method5975(arg1.field4028, arg1.field4027, arg1.field4026)) {
			this.method9839(arg1.field4028, arg1.field4027, arg1.field4026);
		} else {
			this.method9839(arg2.field4028, arg2.field4027, arg2.field4026);
		}
	}

	@ObfuscatedName("vi.ag(IIIS)V")
	public void method9839(int arg0, int arg1, int arg2) {
		if (this.field5679 == null) {
			return;
		}
		int[] var4 = this.field5679.method5977(arg0, arg1, arg2);
		if (var4 == null) {
			var4 = this.field5679.method5977(this.field5679.method5992(), this.field5679.method6035(), this.field5679.method6050());
		}
		this.method9828(var4[0] - this.field5679.method5986() * 64, var4[1] - this.field5679.method5988() * 64, true);
		this.field5703 = -1;
		this.field5680 = -1;
		this.field5705 = this.method9846(this.field5679.method5985());
		this.field5706 = this.field5705;
		this.field5678 = null;
		this.field5732 = null;
		this.field5716.method6199();
	}

	@ObfuscatedName("vi.av(IIIIID)V")
	public void method9891(int arg0, int arg1, int arg2, int arg3, int arg4, double arg5) {
		int[] var8 = new int[4];
		class602.method10676(var8);
		class602.method10674(arg0, arg1, arg0 + arg2, arg1 + arg3);
		int var9 = this.field5685.method9811();
		if (var9 < 100) {
			this.method9845(arg0, arg1, arg2, arg3, var9);
			return;
		}
		if (!this.field5716.method6198()) {
			this.field5716.method6191(this.field5689, this.field5679.method5982(), client.field327);
			if (!this.field5716.method6198()) {
				return;
			}
		}
		int var10 = class363.method6747(this.field5716.method6194(), arg5);
		class602.method10682(arg0, arg1, arg2, arg3, var10);
		if (this.field5714 != null) {
			this.field5712++;
			if (this.field5712 % this.field5708 == 0) {
				this.field5712 = 0;
				this.field5715++;
			}
			if (this.field5715 >= this.field5711 && !this.field5724) {
				this.field5714 = null;
			}
		}
		int var11 = (int) Math.ceil((double) ((float) arg2 / this.field5705));
		int var12 = (int) Math.ceil((double) ((float) arg3 / this.field5705));
		double var13 = class226.method4631();
		this.field5716.method6193(this.field5691 - var11 / 2, this.field5702 - var12 / 2, var11 / 2 + this.field5691, var12 / 2 + this.field5702, arg0, arg1, arg0 + arg2, arg1 + arg3);
		if (!this.field5729) {
			boolean var15 = false;
			if (arg4 - this.field5730 > 100) {
				this.field5730 = arg4;
				var15 = true;
			}
			this.field5716.method6228(this.field5691 - var11 / 2, this.field5702 - var12 / 2, var11 / 2 + this.field5691, var12 / 2 + this.field5702, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field5728, this.field5714, this.field5712, this.field5708, var15);
		}
		this.method9866(arg0, arg1, arg2, arg3, var11, var12);
		boolean var16 = client.field429 >= 2;
		if (var16 && this.field5687 && this.field5722 != null) {
			this.field5694.method8763("Coord: " + this.field5722, class602.field5995 + 10, class602.field5993 + 20, 16776960, -1);
		}
		this.field5707 = var11;
		this.field5697 = var12;
		this.field5709 = arg0;
		this.field5710 = arg1;
		class602.method10742(var8);
		if (var13 != class226.method4631()) {
			class226.method4628(var13);
		}
	}

	@ObfuscatedName("vi.ah(B)V")
	public void method9841() {
		class291.method3465();
	}

	@ObfuscatedName("vi.ab(IIIIIII)Z")
	public boolean method9842(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (this.field5734 == null) {
			return true;
		} else if (this.field5734.field6020 != arg0 || this.field5734.field6021 != arg1) {
			return true;
		} else if (this.field5716.field3361 != this.field5735) {
			return true;
		} else if (client.field433 != this.field5738) {
			return true;
		} else if (arg2 <= 0 && arg3 <= 0) {
			return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
		} else {
			return true;
		}
	}

	@ObfuscatedName("vi.ax(IIIIIII)V")
	public void method9866(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (Statics.field1781 == null) {
			return;
		}
		int var7 = 512 / (this.field5716.field3361 * 2);
		int var8 = arg2 + 512;
		int var9 = arg3 + 512;
		float var10 = 1.0F;
		int var11 = (int) ((float) var8 / var10);
		int var12 = (int) ((float) var9 / var10);
		int var13 = this.method9856() - arg4 / 2 - var7;
		int var14 = this.method9905() - arg5 / 2 - var7;
		int var15 = arg0 - this.field5716.field3361 * (var7 + var13 - this.field5736);
		int var16 = arg1 - this.field5716.field3361 * (var7 - (var14 - this.field5737));
		if (this.method9842(var11, var12, var15, var16, arg2, arg3)) {
			if (this.field5734 != null && this.field5734.field6020 == var11 && this.field5734.field6021 == var12) {
				Arrays.fill(this.field5734.field6019, 0);
			} else {
				this.field5734 = new class606(var11, var12);
			}
			this.field5736 = this.method9856() - arg4 / 2 - var7;
			this.field5737 = this.method9905() - arg5 / 2 - var7;
			this.field5735 = this.field5716.field3361;
			Statics.field1781.method7893(this.field5736, this.field5737, this.field5734, (float) this.field5735 / var10);
			this.field5738 = client.field433;
			var15 = arg0 - this.field5716.field3361 * (var7 + var13 - this.field5736);
			var16 = arg1 - this.field5716.field3361 * (var7 - (var14 - this.field5737));
		}
		class602.method10681(arg0, arg1, arg2, arg3, 0, 128);
		if (var10 == 1.0F) {
			this.field5734.method10823(var15, var16, 192);
		} else {
			this.field5734.method10824(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
		}
	}

	@ObfuscatedName("vi.ak(IIIII)V")
	public void method9844(int arg0, int arg1, int arg2, int arg3) {
		if (!this.field5685.method9815()) {
			return;
		}
		if (!this.field5716.method6198()) {
			this.field5716.method6191(this.field5689, this.field5679.method5982(), client.field327);
			if (!this.field5716.method6198()) {
				return;
			}
		}
		this.field5716.method6195(arg0, arg1, arg2, arg3, this.field5714, this.field5712, this.field5708);
	}

	@ObfuscatedName("vi.aj(IIIIII)V")
	public void method9845(int arg0, int arg1, int arg2, int arg3, int arg4) {
		byte var6 = 20;
		int var7 = arg2 / 2 + arg0;
		int var8 = arg3 / 2 + arg1 - 18 - var6;
		class602.method10682(arg0, arg1, arg2, arg3, -16777216);
		class602.method10686(var7 - 152, var8, 304, 34, -65536);
		class602.method10682(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
		this.field5694.method8842(class394.field4788, var7, var6 + var8, -1, -1);
	}

	@ObfuscatedName("vi.az(II)F")
	public float method9846(int arg0) {
		if (arg0 == 25) {
			return 1.0F;
		} else if (arg0 == 37) {
			return 1.5F;
		} else if (arg0 == 50) {
			return 2.0F;
		} else if (arg0 == 75) {
			return 3.0F;
		} else if (arg0 == 100) {
			return 4.0F;
		} else {
			return 8.0F;
		}
	}

	@ObfuscatedName("vi.bt(I)I")
	public int method9934() {
		if ((double) this.field5706 == 1.0D) {
			return 25;
		} else if ((double) this.field5706 == 1.5D) {
			return 37;
		} else if ((double) this.field5706 == 2.0D) {
			return 50;
		} else if ((double) this.field5706 == 3.0D) {
			return 75;
		} else if ((double) this.field5706 == 4.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@ObfuscatedName("vi.bs(II)V")
	public void method9979(int arg0) {
		this.field5706 = this.method9846(arg0);
	}

	@ObfuscatedName("vi.bu(I)V")
	public void method9849() {
		this.field5685.method9809();
	}

	@ObfuscatedName("vi.bi(I)Z")
	public boolean method9850() {
		return this.field5685.method9815();
	}

	@ObfuscatedName("vi.bd(II)Lll;")
	public class290 method9851(int arg0) {
		Iterator var2 = this.field5695.values().iterator();
		class290 var3;
		do {
			if (!var2.hasNext()) {
				return null;
			}
			var3 = (class290) var2.next();
		} while (var3.method5991() != arg0);
		return var3;
	}

	@ObfuscatedName("vi.ba(III)V")
	public void method9852(int arg0, int arg1) {
		if (this.field5679 != null && this.field5679.method6045(arg0, arg1)) {
			this.field5703 = arg0 - this.field5679.method5986() * 64;
			this.field5680 = arg1 - this.field5679.method5988() * 64;
		}
	}

	@ObfuscatedName("vi.bb(IIB)V")
	public void method9980(int arg0, int arg1) {
		if (this.field5679 != null) {
			this.method9828(arg0 - this.field5679.method5986() * 64, arg1 - this.field5679.method5988() * 64, true);
			this.field5703 = -1;
			this.field5680 = -1;
		}
	}

	@ObfuscatedName("vi.bo(IIIB)V")
	public void method9939(int arg0, int arg1, int arg2) {
		if (this.field5679 != null) {
			int[] var4 = this.field5679.method5977(arg0, arg1, arg2);
			if (var4 != null) {
				this.method9852(var4[0], var4[1]);
			}
		}
	}

	@ObfuscatedName("vi.bl(IIII)V")
	public void method9940(int arg0, int arg1, int arg2) {
		if (this.field5679 != null) {
			int[] var4 = this.field5679.method5977(arg0, arg1, arg2);
			if (var4 != null) {
				this.method9980(var4[0], var4[1]);
			}
		}
	}

	@ObfuscatedName("vi.by(B)I")
	public int method9856() {
		return this.field5679 == null ? -1 : this.field5691 + this.field5679.method5986() * 64;
	}

	@ObfuscatedName("vi.bg(I)I")
	public int method9905() {
		return this.field5679 == null ? -1 : this.field5702 + this.field5679.method5988() * 64;
	}

	@ObfuscatedName("vi.bx(I)Lna;")
	public class357 method10005() {
		return this.field5679 == null ? null : this.field5679.method5978(this.method9856(), this.method9905());
	}

	@ObfuscatedName("vi.bq(I)I")
	public int method9858() {
		return this.field5707;
	}

	@ObfuscatedName("vi.bz(I)I")
	public int method9906() {
		return this.field5697;
	}

	@ObfuscatedName("vi.bn(II)V")
	public void method9860(int arg0) {
		if (arg0 >= 1) {
			this.field5711 = arg0;
		}
	}

	@ObfuscatedName("vi.be(I)V")
	public void method9919() {
		this.field5711 = 3;
	}

	@ObfuscatedName("vi.bh(II)V")
	public void method9862(int arg0) {
		if (arg0 >= 1) {
			this.field5708 = arg0;
		}
	}

	@ObfuscatedName("vi.bk(I)V")
	public void method9972() {
		this.field5708 = 50;
	}

	@ObfuscatedName("vi.bp(ZI)V")
	public void method9864(boolean arg0) {
		this.field5724 = arg0;
	}

	@ObfuscatedName("vi.br(IB)V")
	public void method9865(int arg0) {
		this.field5714 = new HashSet();
		this.field5714.add(arg0);
		this.field5715 = 0;
		this.field5712 = 0;
	}

	@ObfuscatedName("vi.bv(II)V")
	public void method9867(int arg0) {
		this.field5714 = new HashSet();
		this.field5715 = 0;
		this.field5712 = 0;
		for (int var2 = 0; var2 < Statics.field2013; var2++) {
			if (class185.method4094(var2) != null && class185.method4094(var2).field2005 == arg0) {
				this.field5714.add(class185.method4094(var2).field1993);
			}
		}
	}

	@ObfuscatedName("vi.bj(I)V")
	public void method10019() {
		this.field5714 = null;
	}

	@ObfuscatedName("vi.bm(IZI)V")
	public void method9868(int arg0, boolean arg1) {
		if (arg1) {
			this.field5725.remove(arg0);
		} else {
			this.field5725.add(arg0);
		}
		this.method9874();
	}

	@ObfuscatedName("vi.bf(IZB)V")
	public void method9869(int arg0, boolean arg1) {
		if (arg1) {
			this.field5726.remove(arg0);
		} else {
			this.field5726.add(arg0);
		}
		for (int var3 = 0; var3 < Statics.field2013; var3++) {
			if (class185.method4094(var3) != null && class185.method4094(var3).field2005 == arg0) {
				int var4 = class185.method4094(var3).field1993;
				if (arg1) {
					this.field5727.remove(var4);
				} else {
					this.field5727.add(var4);
				}
			}
		}
		this.method9874();
	}

	@ObfuscatedName("vi.bw(I)Z")
	public boolean method9870() {
		return !this.field5729;
	}

	@ObfuscatedName("vi.bc(ZI)V")
	public void method9997(boolean arg0) {
		this.field5729 = !arg0;
	}

	@ObfuscatedName("vi.cw(II)Z")
	public boolean method9872(int arg0) {
		return !this.field5725.contains(arg0);
	}

	@ObfuscatedName("vi.cz(II)Z")
	public boolean method9873(int arg0) {
		return !this.field5726.contains(arg0);
	}

	@ObfuscatedName("vi.cf(I)V")
	public void method9874() {
		this.field5728.clear();
		this.field5728.addAll(this.field5725);
		this.field5728.addAll(this.field5727);
	}

	@ObfuscatedName("vi.cg(IIIIIII)V")
	public void method9875(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (!this.field5685.method9815()) {
			return;
		}
		int var7 = (int) Math.ceil((double) ((float) arg2 / this.field5705));
		int var8 = (int) Math.ceil((double) ((float) arg3 / this.field5705));
		List var9 = this.field5716.method6203(this.field5691 - var7 / 2 - 1, this.field5702 - var8 / 2 - 1, var7 / 2 + this.field5691 + 1, var8 / 2 + this.field5702 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
		if (var9.isEmpty()) {
			return;
		}
		Iterator var10 = var9.iterator();
		boolean var13;
		do {
			if (!var10.hasNext()) {
				return;
			}
			class308 var11 = (class308) var10.next();
			class185 var12 = class185.method4094(var11.method5939());
			var13 = false;
			for (int var14 = this.field5686.length - 1; var14 >= 0; var14--) {
				if (var12.field2009[var14] != null) {
					client.method3654(var12.field2009[var14], var12.field2002, this.field5686[var14], var11.method5939(), var11.field3489.method6811(), var11.field3492.method6811());
					var13 = true;
				}
			}
		} while (!var13);
	}

	@ObfuscatedName("vi.ci(ILna;I)Lna;")
	public class357 method9876(int arg0, class357 arg1) {
		if (!this.field5685.method9815()) {
			return null;
		} else if (!this.field5716.method6198()) {
			return null;
		} else if (this.field5679.method6045(arg1.field4027, arg1.field4026)) {
			HashMap var3 = this.field5716.method6200();
			List var4 = (List) var3.get(arg0);
			if (var4 == null || var4.isEmpty()) {
				return null;
			}
			class308 var5 = null;
			int var6 = -1;
			Iterator var7 = var4.iterator();
			while (true) {
				class308 var8;
				int var11;
				do {
					if (!var7.hasNext()) {
						return var5.field3492;
					}
					var8 = (class308) var7.next();
					int var9 = var8.field3492.field4027 - arg1.field4027;
					int var10 = var8.field3492.field4026 - arg1.field4026;
					var11 = var9 * var9 + var10 * var10;
					if (var11 == 0) {
						return var8.field3492;
					}
				} while (var11 >= var6 && var5 != null);
				var5 = var8;
				var6 = var11;
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("vi.cp(IILna;Lna;I)V")
	public void method9903(int arg0, int arg1, class357 arg2, class357 arg3) {
		class66 var5 = new class66();
		class313 var6 = new class313(arg1, arg2, arg3);
		var5.method2110(new Object[] { var6 });
		switch(arg0) {
			case 1008:
				var5.method2102(10);
				break;
			case 1009:
				var5.method2102(11);
				break;
			case 1010:
				var5.method2102(12);
				break;
			case 1011:
				var5.method2102(13);
				break;
			case 1012:
				var5.method2102(14);
		}
		class47.method6482(var5);
	}

	@ObfuscatedName("vi.cm(B)Lle;")
	public class308 method9883() {
		if (!this.field5685.method9815()) {
			return null;
		} else if (this.field5716.method6198()) {
			HashMap var1 = this.field5716.method6200();
			this.field5678 = new LinkedList();
			Iterator var2 = var1.values().iterator();
			while (var2.hasNext()) {
				List var3 = (List) var2.next();
				this.field5678.addAll(var3);
			}
			this.field5732 = this.field5678.iterator();
			return this.method9847();
		} else {
			return null;
		}
	}

	@ObfuscatedName("vi.cc(B)Lle;")
	public class308 method9847() {
		if (this.field5732 == null) {
			return null;
		}
		class308 var1;
		do {
			if (!this.field5732.hasNext()) {
				return null;
			}
			var1 = (class308) this.field5732.next();
		} while (var1.method5939() == -1);
		return var1;
	}
}
