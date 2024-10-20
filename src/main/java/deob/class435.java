package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("pd")
public class class435 {

    @ObfuscatedName("pd.y")
    public class330 field4694;

    @ObfuscatedName("pd.d")
    public class330 field4747;

    @ObfuscatedName("pd.n")
    public class330 field4692;

    @ObfuscatedName("pd.r")
    public static final class437 field4726 = class437.field4754;

    @ObfuscatedName("pd.l")
    public static final class437 field4724 = class437.field4753;

    @ObfuscatedName("pd.s")
    public static final class437 field4695 = class437.field4756;

    @ObfuscatedName("pd.p")
    public class365 field4696;

    @ObfuscatedName("pd.b")
    public HashMap field4697;

    @ObfuscatedName("pd.o")
    public class476[] field4698;

    @ObfuscatedName("pd.u")
    public HashMap field4699;

    @ObfuscatedName("pd.z")
    public class235 field4700;

    @ObfuscatedName("pd.t")
    public class235 field4701;

    @ObfuscatedName("pd.w")
    public class235 field4702;

    @ObfuscatedName("pd.m")
    public class237 field4703;

    @ObfuscatedName("pd.q")
    public class434 field4704;

    @ObfuscatedName("pd.i")
    public int field4719;

    @ObfuscatedName("pd.e")
    public int field4707;

    @ObfuscatedName("pd.g")
    public int field4693 = -1;

    @ObfuscatedName("pd.k")
    public int field4744 = -1;

    @ObfuscatedName("pd.v")
    public float field4735;

    @ObfuscatedName("pd.aj")
    public float field4710;

    @ObfuscatedName("pd.an")
    public int field4711 = -1;

    @ObfuscatedName("pd.ah")
    public int field4712 = -1;

    @ObfuscatedName("pd.ao")
    public int field4708 = -1;

    @ObfuscatedName("pd.ac")
    public int field4714 = -1;

    @ObfuscatedName("pd.af")
    public int field4715 = 3;

    @ObfuscatedName("pd.ad")
    public int field4706 = 50;

    @ObfuscatedName("pd.av")
    public boolean field4717 = false;

    @ObfuscatedName("pd.ak")
    public HashSet field4718 = null;

    @ObfuscatedName("pd.ae")
    public int field4688 = -1;

    @ObfuscatedName("pd.ap")
    public int field4720 = -1;

    @ObfuscatedName("pd.as")
    public int field4716 = -1;

    @ObfuscatedName("pd.aq")
    public int field4722 = -1;

    @ObfuscatedName("pd.al")
    public int field4723 = -1;

    @ObfuscatedName("pd.ag")
    public int field4709 = -1;

    @ObfuscatedName("pd.am")
    public long field4725;

    @ObfuscatedName("pd.az")
    public int field4742;

    @ObfuscatedName("pd.ab")
    public int field4727;

    @ObfuscatedName("pd.ai")
    public boolean field4728 = true;

    @ObfuscatedName("pd.at")
    public HashSet field4729 = new HashSet();

    @ObfuscatedName("pd.ar")
    public HashSet field4730 = new HashSet();

    @ObfuscatedName("pd.ay")
    public HashSet field4731 = new HashSet();

    @ObfuscatedName("pd.ax")
    public HashSet field4732 = new HashSet();

    @ObfuscatedName("pd.aa")
    public boolean field4734 = false;

    @ObfuscatedName("pd.bx")
    public int field4713 = 0;

    @ObfuscatedName("pd.bm")
    public final int[] field4721 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("pd.bp")
    public List field4733;

    @ObfuscatedName("pd.bl")
    public Iterator field4737;

    @ObfuscatedName("pd.bo")
    public HashSet field4691 = new HashSet();

    @ObfuscatedName("pd.bg")
    public class294 field4739 = null;

    @ObfuscatedName("pd.bd")
    public boolean field4740 = false;

    @ObfuscatedName("pd.bq")
    public class477 field4741;

    @ObfuscatedName("pd.bk")
    public int field4736;

    @ObfuscatedName("pd.bc")
    public int field4743 = -1;

    @ObfuscatedName("pd.bv")
    public int field4705 = -1;

    @ObfuscatedName("pd.bt")
    public int field4745 = -1;

    @ObfuscatedName("pd.a(Llg;Llg;Llg;Lnl;Ljava/util/HashMap;[Lry;B)V")
    public void method7378(class330 arg0, class330 arg1, class330 arg2, class365 arg3, HashMap arg4, class476[] arg5) {
        this.field4698 = arg5;
        this.field4694 = arg0;
        this.field4747 = arg1;
        this.field4692 = arg2;
        this.field4696 = arg3;
        this.field4697 = new HashMap();
        this.field4697.put(class232.field2752, arg4.get(field4726));
        this.field4697.put(class232.field2753, arg4.get(field4724));
        this.field4697.put(class232.field2755, arg4.get(field4695));
        this.field4704 = new class434(arg0);
        int var7 = this.field4694.method5813(class254.field2955.field2954);
        int[] var8 = this.field4694.method5792(var7);
        this.field4699 = new HashMap(var8.length);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class464 var10 = new class464(this.field4694.method5859(var7, var8[var9]));
            class235 var11 = new class235();
            var11.method4407(var10, var8[var9]);
            this.field4699.put(var11.method4388(), var11);
            if (var11.method4419()) {
                this.field4700 = var11;
            }
        }
        this.method7214(this.field4700);
        this.field4702 = null;
    }

    @ObfuscatedName("pd.f(I)V")
    public void method7212() {
        class236.field2801.method4828(5);
    }

    @ObfuscatedName("pd.c(IIZIIIII)V")
    public void method7294(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field4704.method7199()) {
            return;
        }
        this.method7216();
        this.method7374();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field4735));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field4735));
        List var10 = this.field4703.method4627(this.field4719 - var8 / 2 - 1, this.field4707 - var9 / 2 - 1, var8 / 2 + this.field4719 + 1, var9 / 2 + this.field4707 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class253 var13 = (class253) var12.next();
            var11.add(var13);
            class85 var14 = new class85();
            class258 var15 = new class258(var13.method4330(), var13.field2942, var13.field2948);
            var14.method2147(new Object[] { var15, arg0, arg1 });
            if (this.field4691.contains(var13)) {
                var14.method2145(17);
            } else {
                var14.method2145(15);
            }
            class68.method4883(var14);
        }
        Iterator var16 = this.field4691.iterator();
        while (var16.hasNext()) {
            class253 var17 = (class253) var16.next();
            if (!var11.contains(var17)) {
                class85 var18 = new class85();
                class258 var19 = new class258(var17.method4330(), var17.field2942, var17.field2948);
                var18.method2147(new Object[] { var19, arg0, arg1 });
                var18.method2145(16);
                class68.method4883(var18);
            }
        }
        this.field4691 = var11;
    }

    @ObfuscatedName("pd.x(IIZZI)V")
    public void method7379(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class280.method2629();
        this.method7301(arg0, arg1, arg3, var5);
        if (this.method7371() || !(arg3 || arg2) || client.method5112()) {
            this.method7219();
        } else {
            if (arg3) {
                this.field4723 = arg0;
                this.field4709 = arg1;
                this.field4716 = this.field4719;
                this.field4722 = this.field4707;
            }
            if (this.field4716 != -1) {
                int var7 = arg0 - this.field4723;
                int var8 = arg1 - this.field4709;
                this.method7218(this.field4716 - (int) ((float) var7 / this.field4710), this.field4722 + (int) ((float) var8 / this.field4710), false);
            }
        }
        if (arg3) {
            this.field4725 = var5;
            this.field4742 = arg0;
            this.field4727 = arg1;
        }
    }

    @ObfuscatedName("pd.h(IIZJ)V")
    public void method7301(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field4701 == null) {
            this.field4739 = null;
            return;
        }
        int var6 = (int) ((float) this.field4719 + ((float) (arg0 - this.field4708) - (float) this.method7248() * this.field4735 / 2.0F) / this.field4735);
        int var7 = (int) ((float) this.field4707 - ((float) (arg1 - this.field4714) - (float) this.method7249() * this.field4735 / 2.0F) / this.field4735);
        this.field4739 = this.field4701.method4434(var6 + this.field4701.method4458() * 64, var7 + this.field4701.method4413() * 64);
        if (this.field4739 == null || !arg2) {
            return;
        }
        class200 var8 = client.field734;
        if (Statics.method2654() && var8.method3626(82) && var8.method3626(81)) {
            Statics.method2868(this.field4739.field3397, this.field4739.field3396, this.field4739.field3395, false);
            return;
        }
        boolean var10 = true;
        if (this.field4728) {
            int var11 = arg0 - this.field4742;
            int var12 = arg1 - this.field4727;
            if (arg3 - this.field4725 > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) {
                var10 = false;
            }
        }
        if (var10) {
            class275 var13 = class275.method3314(class273.field3039, client.field636.field1373);
            var13.field3123.method7835(this.field4739.method5143());
            client.field636.method2540(var13);
            this.field4725 = 0L;
        }
    }

    @ObfuscatedName("pd.j(B)V")
    public void method7216() {
        if (Statics.field4145 != null) {
            this.field4735 = this.field4710;
            return;
        }
        if (this.field4735 < this.field4710) {
            this.field4735 = Math.min(this.field4710, this.field4735 / 30.0F + this.field4735);
        }
        if (this.field4735 > this.field4710) {
            this.field4735 = Math.max(this.field4710, this.field4735 - this.field4735 / 30.0F);
        }
    }

    @ObfuscatedName("pd.y(S)V")
    public void method7374() {
        if (!this.method7371()) {
            return;
        }
        int var1 = this.field4693 - this.field4719;
        int var2 = this.field4744 - this.field4707;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method7218(this.field4719 + var1, this.field4707 + var2, true);
        if (this.field4719 == this.field4693 && this.field4744 == this.field4707) {
            this.field4693 = -1;
            this.field4744 = -1;
        }
    }

    @ObfuscatedName("pd.d(IIZI)V")
    public final void method7218(int arg0, int arg1, boolean arg2) {
        this.field4719 = arg0;
        this.field4707 = arg1;
        class280.method2629();
        if (arg2) {
            this.method7219();
        }
    }

    @ObfuscatedName("pd.n(B)V")
    public final void method7219() {
        this.field4709 = -1;
        this.field4723 = -1;
        this.field4722 = -1;
        this.field4716 = -1;
    }

    @ObfuscatedName("pd.r(B)Z")
    public boolean method7371() {
        return this.field4693 != -1 && this.field4744 != -1;
    }

    @ObfuscatedName("pd.l(IIIB)Lit;")
    public class235 method7351(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field4699.values().iterator();
        class235 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class235) var4.next();
        } while (!var5.method4417(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("pd.s(IIIZI)V")
    public void method7234(int arg0, int arg1, int arg2, boolean arg3) {
        class235 var5 = this.method7351(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field4700;
        }
        boolean var6 = false;
        if (this.field4702 != var5 || arg3) {
            this.field4702 = var5;
            this.method7214(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method7400(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("pd.p(II)V")
    public void method7253(int arg0) {
        class235 var2 = this.method7240(arg0);
        if (var2 != null) {
            this.method7214(var2);
        }
    }

    @ObfuscatedName("pd.b(I)I")
    public int method7220() {
        return this.field4701 == null ? -1 : this.field4701.method4397();
    }

    @ObfuscatedName("pd.o(I)Lit;")
    public class235 method7225() {
        return this.field4701;
    }

    @ObfuscatedName("pd.u(Lit;B)V")
    public void method7214(class235 arg0) {
        if (this.field4701 == null || this.field4701 != arg0) {
            this.method7229(arg0);
            this.method7400(-1, -1, -1);
        }
    }

    @ObfuscatedName("pd.z(Lit;I)V")
    public void method7229(class235 arg0) {
        this.field4701 = arg0;
        this.field4703 = new class237(this.field4698, this.field4697, this.field4747, this.field4692);
        this.field4704.method7197(this.field4701.method4388());
    }

    @ObfuscatedName("pd.t(Lit;Lki;Lki;ZI)V")
    public void method7228(class235 arg0, class294 arg1, class294 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field4701 == null || this.field4701 != arg0) {
            this.method7229(arg0);
        }
        if (!arg3 && this.field4701.method4417(arg1.field3395, arg1.field3397, arg1.field3396)) {
            this.method7400(arg1.field3395, arg1.field3397, arg1.field3396);
        } else {
            this.method7400(arg2.field3395, arg2.field3397, arg2.field3396);
        }
    }

    @ObfuscatedName("pd.w(IIII)V")
    public void method7400(int arg0, int arg1, int arg2) {
        if (this.field4701 == null) {
            return;
        }
        int[] var4 = this.field4701.method4383(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field4701.method4383(this.field4701.method4437(), this.field4701.method4403(), this.field4701.method4442());
        }
        this.method7218(var4[0] - this.field4701.method4458() * 64, var4[1] - this.field4701.method4413() * 64, true);
        this.field4693 = -1;
        this.field4744 = -1;
        this.field4735 = this.method7405(this.field4701.method4391());
        this.field4710 = this.field4735;
        this.field4733 = null;
        this.field4737 = null;
        this.field4703.method4634();
    }

    @ObfuscatedName("pd.m(IIIIII)V")
    public void method7300(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class473.method8080(var6);
        class473.method8015(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class473.method8022(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field4704.method7196();
        if (var7 < 100) {
            this.method7299(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field4703.method4605()) {
            this.field4703.method4597(this.field4694, this.field4701.method4388(), client.field493);
            if (!this.field4703.method4605()) {
                return;
            }
        }
        if (this.field4718 != null) {
            this.field4720++;
            if (this.field4720 % this.field4706 == 0) {
                this.field4720 = 0;
                this.field4688++;
            }
            if (this.field4688 >= this.field4715 && !this.field4717) {
                this.field4718 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field4735));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field4735));
        class244.field2886 = client.field790 >= 209;
        this.field4703.method4599(this.field4719 - var8 / 2, this.field4707 - var9 / 2, var8 / 2 + this.field4719, var9 / 2 + this.field4707, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field4734) {
            boolean var10 = false;
            if (arg4 - this.field4713 > 100) {
                this.field4713 = arg4;
                var10 = true;
            }
            this.field4703.method4600(this.field4719 - var8 / 2, this.field4707 - var9 / 2, var8 / 2 + this.field4719, var9 / 2 + this.field4707, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field4732, this.field4718, this.field4720, this.field4706, var10);
        }
        this.method7232(arg0, arg1, arg2, arg3, var8, var9);
        if (Statics.method2654() && this.field4740 && this.field4739 != null) {
            this.field4696.method6429("Coord: " + this.field4739, class473.field4939 + 10, class473.field4937 + 20, 16776960, -1);
        }
        this.field4711 = var8;
        this.field4712 = var9;
        this.field4708 = arg0;
        this.field4714 = arg1;
        class473.method8017(var6);
    }

    @ObfuscatedName("pd.q(IIIIIII)Z")
    public boolean method7231(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4741 == null) {
            return true;
        } else if (this.field4741.field4966 != arg0 || this.field4741.field4958 != arg1) {
            return true;
        } else if (this.field4703.field2818 != this.field4736) {
            return true;
        } else if (client.field794 != this.field4745) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("pd.i(IIIIIII)V")
    public void method7232(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field4145 == null) {
            return;
        }
        int var7 = 512 / (this.field4703.field2818 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method7245() - arg4 / 2 - var7;
        int var14 = this.method7246() - arg5 / 2 - var7;
        int var15 = arg0 - this.field4703.field2818 * (var7 + var13 - this.field4743);
        int var16 = arg1 - this.field4703.field2818 * (var7 - (var14 - this.field4705));
        if (this.method7231(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field4741 != null && this.field4741.field4966 == var11 && this.field4741.field4958 == var12) {
                Arrays.fill(this.field4741.field4959, 0);
            } else {
                this.field4741 = new class477(var11, var12);
            }
            this.field4743 = this.method7245() - arg4 / 2 - var7;
            this.field4705 = this.method7246() - arg5 / 2 - var7;
            this.field4736 = this.field4703.field2818;
            Statics.field4145.method5965(this.field4743, this.field4705, this.field4741, (float) this.field4736 / var10);
            this.field4745 = client.field794;
            var15 = arg0 - this.field4703.field2818 * (var7 + var13 - this.field4743);
            var16 = arg1 - this.field4703.field2818 * (var7 - (var14 - this.field4705));
        }
        class473.method8021(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field4741.method8143(var15, var16, 192);
        } else {
            this.field4741.method8146(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("pd.e(IIIII)V")
    public void method7233(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field4704.method7199()) {
            return;
        }
        if (!this.field4703.method4605()) {
            this.field4703.method4597(this.field4694, this.field4701.method4388(), client.field493);
            if (!this.field4703.method4605()) {
                return;
            }
        }
        this.field4703.method4601(arg0, arg1, arg2, arg3, this.field4718, this.field4720, this.field4706);
    }

    @ObfuscatedName("pd.g(IB)V")
    public void method7222(int arg0) {
        this.field4710 = this.method7405(arg0);
    }

    @ObfuscatedName("pd.k(IIIIII)V")
    public void method7299(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class473.method8022(arg0, arg1, arg2, arg3, -16777216);
        class473.method8026(var7 - 152, var8, 304, 34, -65536);
        class473.method8022(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field4696.method6507(class323.field3836, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("pd.v(IS)F")
    public float method7405(int arg0) {
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

    @ObfuscatedName("pd.aj(I)I")
    public int method7237() {
        if ((double) this.field4710 == 1.0D) {
            return 25;
        } else if ((double) this.field4710 == 1.5D) {
            return 37;
        } else if ((double) this.field4710 == 2.0D) {
            return 50;
        } else if ((double) this.field4710 == 3.0D) {
            return 75;
        } else if ((double) this.field4710 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("pd.an(B)V")
    public void method7238() {
        this.field4704.method7198();
    }

    @ObfuscatedName("pd.ah(I)Z")
    public boolean method7239() {
        return this.field4704.method7199();
    }

    @ObfuscatedName("pd.ao(IB)Lit;")
    public class235 method7240(int arg0) {
        Iterator var2 = this.field4699.values().iterator();
        class235 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class235) var2.next();
        } while (var3.method4397() != arg0);
        return var3;
    }

    @ObfuscatedName("pd.ac(III)V")
    public void method7241(int arg0, int arg1) {
        if (this.field4701 != null && this.field4701.method4382(arg0, arg1)) {
            this.field4693 = arg0 - this.field4701.method4458() * 64;
            this.field4744 = arg1 - this.field4701.method4413() * 64;
        }
    }

    @ObfuscatedName("pd.af(III)V")
    public void method7242(int arg0, int arg1) {
        if (this.field4701 != null) {
            this.method7218(arg0 - this.field4701.method4458() * 64, arg1 - this.field4701.method4413() * 64, true);
            this.field4693 = -1;
            this.field4744 = -1;
        }
    }

    @ObfuscatedName("pd.ad(IIII)V")
    public void method7243(int arg0, int arg1, int arg2) {
        if (this.field4701 != null) {
            int[] var4 = this.field4701.method4383(arg0, arg1, arg2);
            if (var4 != null) {
                this.method7241(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("pd.av(IIIB)V")
    public void method7244(int arg0, int arg1, int arg2) {
        if (this.field4701 != null) {
            int[] var4 = this.field4701.method4383(arg0, arg1, arg2);
            if (var4 != null) {
                this.method7242(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("pd.ak(I)I")
    public int method7245() {
        return this.field4701 == null ? -1 : this.field4719 + this.field4701.method4458() * 64;
    }

    @ObfuscatedName("pd.ae(I)I")
    public int method7246() {
        return this.field4701 == null ? -1 : this.field4707 + this.field4701.method4413() * 64;
    }

    @ObfuscatedName("pd.ap(B)Lki;")
    public class294 method7247() {
        return this.field4701 == null ? null : this.field4701.method4434(this.method7245(), this.method7246());
    }

    @ObfuscatedName("pd.as(I)I")
    public int method7248() {
        return this.field4711;
    }

    @ObfuscatedName("pd.aq(I)I")
    public int method7249() {
        return this.field4712;
    }

    @ObfuscatedName("pd.al(II)V")
    public void method7250(int arg0) {
        if (arg0 >= 1) {
            this.field4715 = arg0;
        }
    }

    @ObfuscatedName("pd.ag(I)V")
    public void method7235() {
        this.field4715 = 3;
    }

    @ObfuscatedName("pd.am(IB)V")
    public void method7252(int arg0) {
        if (arg0 >= 1) {
            this.field4706 = arg0;
        }
    }

    @ObfuscatedName("pd.az(I)V")
    public void method7282() {
        this.field4706 = 50;
    }

    @ObfuscatedName("pd.ab(ZI)V")
    public void method7344(boolean arg0) {
        this.field4717 = arg0;
    }

    @ObfuscatedName("pd.ai(IB)V")
    public void method7402(int arg0) {
        this.field4718 = new HashSet();
        this.field4718.add(arg0);
        this.field4688 = 0;
        this.field4720 = 0;
    }

    @ObfuscatedName("pd.au(IB)V")
    public void method7368(int arg0) {
        this.field4718 = new HashSet();
        this.field4688 = 0;
        this.field4720 = 0;
        for (int var2 = 0; var2 < Statics.field1878; var2++) {
            if (class178.method2234(var2) != null && class178.method2234(var2).field1896 == arg0) {
                this.field4718.add(class178.method2234(var2).field1890);
            }
        }
    }

    @ObfuscatedName("pd.aw(B)V")
    public void method7257() {
        this.field4718 = null;
    }

    @ObfuscatedName("pd.at(ZI)V")
    public void method7258(boolean arg0) {
        this.field4734 = !arg0;
    }

    @ObfuscatedName("pd.ar(IZB)V")
    public void method7259(int arg0, boolean arg1) {
        if (arg1) {
            this.field4729.remove(arg0);
        } else {
            this.field4729.add(arg0);
        }
        this.method7221();
    }

    @ObfuscatedName("pd.ay(IZB)V")
    public void method7260(int arg0, boolean arg1) {
        if (arg1) {
            this.field4730.remove(arg0);
        } else {
            this.field4730.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field1878; var3++) {
            if (class178.method2234(var3) != null && class178.method2234(var3).field1896 == arg0) {
                int var4 = class178.method2234(var3).field1890;
                if (arg1) {
                    this.field4731.remove(var4);
                } else {
                    this.field4731.add(var4);
                }
            }
        }
        this.method7221();
    }

    @ObfuscatedName("pd.ax(B)Z")
    public boolean method7261() {
        return !this.field4734;
    }

    @ObfuscatedName("pd.aa(IB)Z")
    public boolean method7262(int arg0) {
        return !this.field4729.contains(arg0);
    }

    @ObfuscatedName("pd.bx(II)Z")
    public boolean method7263(int arg0) {
        return !this.field4730.contains(arg0);
    }

    @ObfuscatedName("pd.bh(I)V")
    public void method7221() {
        this.field4732.clear();
        this.field4732.addAll(this.field4729);
        this.field4732.addAll(this.field4731);
    }

    @ObfuscatedName("pd.bm(IIIIIII)V")
    public void method7265(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field4704.method7199()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field4735));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field4735));
        List var9 = this.field4703.method4627(this.field4719 - var7 / 2 - 1, this.field4707 - var8 / 2 - 1, var7 / 2 + this.field4719 + 1, var8 / 2 + this.field4707 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
        if (var9.isEmpty()) {
            return;
        }
        Iterator var10 = var9.iterator();
        boolean var13;
        do {
            if (!var10.hasNext()) {
                return;
            }
            class253 var11 = (class253) var10.next();
            class178 var12 = class178.method2234(var11.method4330());
            var13 = false;
            for (int var14 = this.field4721.length - 1; var14 >= 0; var14--) {
                if (var12.field1885[var14] != null) {
                    client.method203(var12.field1885[var14], var12.field1886, this.field4721[var14], var11.method4330(), var11.field2942.method5143(), var11.field2948.method5143());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("pd.bp(ILki;I)Lki;")
    public class294 method7266(int arg0, class294 arg1) {
        if (!this.field4704.method7199()) {
            return null;
        } else if (!this.field4703.method4605()) {
            return null;
        } else if (this.field4701.method4382(arg1.field3397, arg1.field3396)) {
            HashMap var3 = this.field4703.method4625();
            List var4 = (List) var3.get(arg0);
            if (var4 == null || var4.isEmpty()) {
                return null;
            }
            class253 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();
            while (true) {
                class253 var8;
                int var11;
                do {
                    if (!var7.hasNext()) {
                        return var5.field2948;
                    }
                    var8 = (class253) var7.next();
                    int var9 = var8.field2948.field3397 - arg1.field3397;
                    int var10 = var8.field2948.field3396 - arg1.field3396;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field2948;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("pd.bl(IILki;Lki;I)V")
    public void method7267(int arg0, int arg1, class294 arg2, class294 arg3) {
        class85 var5 = new class85();
        class258 var6 = new class258(arg1, arg2, arg3);
        var5.method2147(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method2145(10);
                break;
            case 1009:
                var5.method2145(11);
                break;
            case 1010:
                var5.method2145(12);
                break;
            case 1011:
                var5.method2145(13);
                break;
            case 1012:
                var5.method2145(14);
        }
        class68.method4883(var5);
    }

    @ObfuscatedName("pd.bo(I)Liq;")
    public class253 method7268() {
        if (!this.field4704.method7199()) {
            return null;
        } else if (this.field4703.method4605()) {
            HashMap var1 = this.field4703.method4625();
            this.field4733 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field4733.addAll(var3);
            }
            this.field4737 = this.field4733.iterator();
            return this.method7355();
        } else {
            return null;
        }
    }

    @ObfuscatedName("pd.bg(B)Liq;")
    public class253 method7355() {
        if (this.field4737 == null) {
            return null;
        }
        class253 var1;
        do {
            if (!this.field4737.hasNext()) {
                return null;
            }
            var1 = (class253) this.field4737.next();
        } while (var1.method4330() == -1);
        return var1;
    }
}
