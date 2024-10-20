package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("pb")
public class class438 {

    @ObfuscatedName("pb.f")
    public class333 field4740;

    @ObfuscatedName("pb.r")
    public class333 field4741;

    @ObfuscatedName("pb.u")
    public class333 field4742;

    @ObfuscatedName("pb.b")
    public static final class440 field4743 = class440.field4805;

    @ObfuscatedName("pb.j")
    public static final class440 field4744 = class440.field4806;

    @ObfuscatedName("pb.g")
    public static final class440 field4753 = class440.field4802;

    @ObfuscatedName("pb.i")
    public class368 field4746;

    @ObfuscatedName("pb.o")
    public HashMap field4747;

    @ObfuscatedName("pb.n")
    public class480[] field4786;

    @ObfuscatedName("pb.k")
    public HashMap field4749;

    @ObfuscatedName("pb.a")
    public class238 field4750;

    @ObfuscatedName("pb.s")
    public class238 field4751;

    @ObfuscatedName("pb.l")
    public class238 field4752;

    @ObfuscatedName("pb.t")
    public class240 field4736;

    @ObfuscatedName("pb.c")
    public class437 field4754;

    @ObfuscatedName("pb.p")
    public int field4755;

    @ObfuscatedName("pb.d")
    public int field4745;

    @ObfuscatedName("pb.y")
    public int field4757 = -1;

    @ObfuscatedName("pb.z")
    public int field4758 = -1;

    @ObfuscatedName("pb.w")
    public float field4759;

    @ObfuscatedName("pb.as")
    public float field4766;

    @ObfuscatedName("pb.ad")
    public int field4761 = -1;

    @ObfuscatedName("pb.ao")
    public int field4762 = -1;

    @ObfuscatedName("pb.am")
    public int field4760 = -1;

    @ObfuscatedName("pb.av")
    public int field4764 = -1;

    @ObfuscatedName("pb.au")
    public int field4763 = 3;

    @ObfuscatedName("pb.ar")
    public int field4776 = 50;

    @ObfuscatedName("pb.at")
    public boolean field4767 = false;

    @ObfuscatedName("pb.ay")
    public HashSet field4768 = null;

    @ObfuscatedName("pb.an")
    public int field4769 = -1;

    @ObfuscatedName("pb.ab")
    public int field4770 = -1;

    @ObfuscatedName("pb.al")
    public int field4773 = -1;

    @ObfuscatedName("pb.ag")
    public int field4772 = -1;

    @ObfuscatedName("pb.az")
    public int field4794 = -1;

    @ObfuscatedName("pb.ak")
    public int field4774 = -1;

    @ObfuscatedName("pb.af")
    public long field4775;

    @ObfuscatedName("pb.ai")
    public int field4789;

    @ObfuscatedName("pb.ax")
    public int field4777;

    @ObfuscatedName("pb.ah")
    public boolean field4778 = true;

    @ObfuscatedName("pb.aq")
    public HashSet field4771 = new HashSet();

    @ObfuscatedName("pb.ap")
    public HashSet field4756 = new HashSet();

    @ObfuscatedName("pb.aa")
    public HashSet field4782 = new HashSet();

    @ObfuscatedName("pb.ae")
    public HashSet field4783 = new HashSet();

    @ObfuscatedName("pb.ac")
    public boolean field4784 = false;

    @ObfuscatedName("pb.bh")
    public int field4785 = 0;

    @ObfuscatedName("pb.bf")
    public final int[] field4796 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("pb.bo")
    public List field4787;

    @ObfuscatedName("pb.by")
    public Iterator field4788;

    @ObfuscatedName("pb.bw")
    public HashSet field4781 = new HashSet();

    @ObfuscatedName("pb.bp")
    public class297 field4790 = null;

    @ObfuscatedName("pb.bc")
    public boolean field4791 = false;

    @ObfuscatedName("pb.bl")
    public class481 field4748;

    @ObfuscatedName("pb.bv")
    public int field4793;

    @ObfuscatedName("pb.bx")
    public int field4795 = -1;

    @ObfuscatedName("pb.bg")
    public int field4737 = -1;

    @ObfuscatedName("pb.bz")
    public int field4780 = -1;

    @ObfuscatedName("pb.h(Lly;Lly;Lly;Lnv;Ljava/util/HashMap;[Lra;I)V")
    public void method7270(class333 arg0, class333 arg1, class333 arg2, class368 arg3, HashMap arg4, class480[] arg5) {
        this.field4786 = arg5;
        this.field4740 = arg0;
        this.field4741 = arg1;
        this.field4742 = arg2;
        this.field4746 = arg3;
        this.field4747 = new HashMap();
        this.field4747.put(class235.field2827, arg4.get(field4743));
        this.field4747.put(class235.field2826, arg4.get(field4744));
        this.field4747.put(class235.field2828, arg4.get(field4753));
        this.field4754 = new class437(arg0);
        int var7 = this.field4740.method5861(class257.field3011.field3009);
        int[] var8 = this.field4740.method5854(var7);
        this.field4749 = new HashMap(var8.length);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class467 var10 = new class467(this.field4740.method5909(var7, var8[var9]));
            class238 var11 = new class238();
            var11.method4502(var10, var8[var9]);
            this.field4749.put(var11.method4511(), var11);
            if (var11.method4540()) {
                this.field4750 = var11;
            }
        }
        this.method7284(this.field4750);
        this.field4752 = null;
    }

    @ObfuscatedName("pb.e(B)V")
    public void method7271() {
        class239.field2870.method4896(5);
    }

    @ObfuscatedName("pb.v(IIZIIIIB)V")
    public void method7272(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field4754.method7257()) {
            return;
        }
        this.method7434();
        this.method7326();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field4759));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field4759));
        List var10 = this.field4736.method4700(this.field4755 - var8 / 2 - 1, this.field4745 - var9 / 2 - 1, var8 / 2 + this.field4755 + 1, var9 / 2 + this.field4745 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class256 var13 = (class256) var12.next();
            var11.add(var13);
            class85 var14 = new class85();
            class261 var15 = new class261(var13.method4455(), var13.field3000, var13.field3003);
            var14.method2139(new Object[] { var15, arg0, arg1 });
            if (this.field4781.contains(var13)) {
                var14.method2140(17);
            } else {
                var14.method2140(15);
            }
            class68.method3219(var14);
        }
        Iterator var16 = this.field4781.iterator();
        while (var16.hasNext()) {
            class256 var17 = (class256) var16.next();
            if (!var11.contains(var17)) {
                class85 var18 = new class85();
                class261 var19 = new class261(var17.method4455(), var17.field3000, var17.field3003);
                var18.method2139(new Object[] { var19, arg0, arg1 });
                var18.method2140(16);
                class68.method3219(var18);
            }
        }
        this.field4781 = var11;
    }

    @ObfuscatedName("pb.x(IIZZI)V")
    public void method7273(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = Statics.method1118();
        this.method7274(arg0, arg1, arg3, var5);
        if (this.method7279() || !(arg3 || arg2) || client.method4033()) {
            this.method7278();
        } else {
            if (arg3) {
                this.field4794 = arg0;
                this.field4774 = arg1;
                this.field4773 = this.field4755;
                this.field4772 = this.field4745;
            }
            if (this.field4773 != -1) {
                int var7 = arg0 - this.field4794;
                int var8 = arg1 - this.field4774;
                this.method7277(this.field4773 - (int) ((float) var7 / this.field4766), this.field4772 + (int) ((float) var8 / this.field4766), false);
            }
        }
        if (arg3) {
            this.field4775 = var5;
            this.field4789 = arg0;
            this.field4777 = arg1;
        }
    }

    @ObfuscatedName("pb.m(IIZJ)V")
    public void method7274(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field4751 == null) {
            this.field4790 = null;
            return;
        }
        int var6 = (int) ((float) this.field4755 + ((float) (arg0 - this.field4760) - (float) this.method7305() * this.field4759 / 2.0F) / this.field4759);
        int var7 = (int) ((float) this.field4745 - ((float) (arg1 - this.field4764) - (float) this.method7306() * this.field4759 / 2.0F) / this.field4759);
        this.field4790 = this.field4751.method4507(var6 + this.field4751.method4527() * 64, var7 + this.field4751.method4517() * 64);
        if (this.field4790 == null || !arg2) {
            return;
        }
        class202 var8 = client.field748;
        if (client.method3130() && var8.method3737(82) && var8.method3737(81)) {
            int var10 = this.field4790.field3451;
            int var11 = this.field4790.field3452;
            int var12 = this.field4790.field3450;
            class278 var13 = class278.method2890(class276.field3121, client.field567.field1425);
            var13.field3177.method7849(var11);
            var13.field3177.method7820(var12);
            var13.field3177.method7830(var10);
            var13.field3177.method7843(0);
            client.field567.method2603(var13);
            return;
        }
        boolean var14 = true;
        if (this.field4778) {
            int var15 = arg0 - this.field4789;
            int var16 = arg1 - this.field4777;
            if (arg3 - this.field4775 > 500L || var15 < -25 || var15 > 25 || var16 < -25 || var16 > 25) {
                var14 = false;
            }
        }
        if (var14) {
            class278 var17 = class278.method2890(class276.field3109, client.field567.field1425);
            var17.field3177.method7778(this.field4790.method5225());
            client.field567.method2603(var17);
            this.field4775 = 0L;
        }
    }

    @ObfuscatedName("pb.q(I)V")
    public void method7434() {
        if (Statics.field242 != null) {
            this.field4759 = this.field4766;
            return;
        }
        if (this.field4759 < this.field4766) {
            this.field4759 = Math.min(this.field4766, this.field4759 / 30.0F + this.field4759);
        }
        if (this.field4759 > this.field4766) {
            this.field4759 = Math.max(this.field4766, this.field4759 - this.field4759 / 30.0F);
        }
    }

    @ObfuscatedName("pb.f(B)V")
    public void method7326() {
        if (!this.method7279()) {
            return;
        }
        int var1 = this.field4757 - this.field4755;
        int var2 = this.field4758 - this.field4745;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method7277(this.field4755 + var1, this.field4745 + var2, true);
        if (this.field4757 == this.field4755 && this.field4758 == this.field4745) {
            this.field4757 = -1;
            this.field4758 = -1;
        }
    }

    @ObfuscatedName("pb.r(IIZB)V")
    public final void method7277(int arg0, int arg1, boolean arg2) {
        this.field4755 = arg0;
        this.field4745 = arg1;
        Statics.method1118();
        if (arg2) {
            this.method7278();
        }
    }

    @ObfuscatedName("pb.u(B)V")
    public final void method7278() {
        this.field4774 = -1;
        this.field4794 = -1;
        this.field4772 = -1;
        this.field4773 = -1;
    }

    @ObfuscatedName("pb.b(I)Z")
    public boolean method7279() {
        return this.field4757 != -1 && this.field4758 != -1;
    }

    @ObfuscatedName("pb.j(IIII)Lit;")
    public class238 method7280(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field4749.values().iterator();
        class238 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class238) var4.next();
        } while (!var5.method4548(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("pb.g(IIIZB)V")
    public void method7281(int arg0, int arg1, int arg2, boolean arg3) {
        class238 var5 = this.method7280(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field4750;
        }
        boolean var6 = false;
        if (this.field4752 != var5 || arg3) {
            this.field4752 = var5;
            this.method7284(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method7287(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("pb.i(II)V")
    public void method7282(int arg0) {
        class238 var2 = this.method7298(arg0);
        if (var2 != null) {
            this.method7284(var2);
        }
    }

    @ObfuscatedName("pb.o(I)I")
    public int method7418() {
        return this.field4751 == null ? -1 : this.field4751.method4509();
    }

    @ObfuscatedName("pb.n(I)Lit;")
    public class238 method7283() {
        return this.field4751;
    }

    @ObfuscatedName("pb.k(Lit;I)V")
    public void method7284(class238 arg0) {
        if (this.field4751 == null || this.field4751 != arg0) {
            this.method7285(arg0);
            this.method7287(-1, -1, -1);
        }
    }

    @ObfuscatedName("pb.a(Lit;I)V")
    public void method7285(class238 arg0) {
        this.field4751 = arg0;
        this.field4736 = new class240(this.field4786, this.field4747, this.field4741, this.field4742);
        this.field4754.method7255(this.field4751.method4511());
    }

    @ObfuscatedName("pb.s(Lit;Lky;Lky;ZB)V")
    public void method7328(class238 arg0, class297 arg1, class297 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field4751 == null || this.field4751 != arg0) {
            this.method7285(arg0);
        }
        if (!arg3 && this.field4751.method4548(arg1.field3450, arg1.field3451, arg1.field3452)) {
            this.method7287(arg1.field3450, arg1.field3451, arg1.field3452);
        } else {
            this.method7287(arg2.field3450, arg2.field3451, arg2.field3452);
        }
    }

    @ObfuscatedName("pb.l(IIII)V")
    public void method7287(int arg0, int arg1, int arg2) {
        if (this.field4751 == null) {
            return;
        }
        int[] var4 = this.field4751.method4539(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field4751.method4539(this.field4751.method4561(), this.field4751.method4519(), this.field4751.method4521());
        }
        this.method7277(var4[0] - this.field4751.method4527() * 64, var4[1] - this.field4751.method4517() * 64, true);
        this.field4757 = -1;
        this.field4758 = -1;
        this.field4759 = this.method7294(this.field4751.method4514());
        this.field4766 = this.field4759;
        this.field4787 = null;
        this.field4788 = null;
        this.field4736.method4696();
    }

    @ObfuscatedName("pb.t(IIIIIB)V")
    public void method7288(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class477.method8114(var6);
        class477.method8112(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class477.method8120(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field4754.method7254();
        if (var7 < 100) {
            this.method7293(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field4736.method4702()) {
            this.field4736.method4722(this.field4740, this.field4751.method4511(), client.field510);
            if (!this.field4736.method4702()) {
                return;
            }
        }
        if (this.field4768 != null) {
            this.field4770++;
            if (this.field4770 % this.field4776 == 0) {
                this.field4770 = 0;
                this.field4769++;
            }
            if (this.field4769 >= this.field4763 && !this.field4767) {
                this.field4768 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field4759));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field4759));
        class247.field2954 = client.field516 >= 209;
        this.field4736.method4697(this.field4755 - var8 / 2, this.field4745 - var9 / 2, var8 / 2 + this.field4755, var9 / 2 + this.field4745, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field4784) {
            boolean var10 = false;
            if (arg4 - this.field4785 > 100) {
                this.field4785 = arg4;
                var10 = true;
            }
            this.field4736.method4698(this.field4755 - var8 / 2, this.field4745 - var9 / 2, var8 / 2 + this.field4755, var9 / 2 + this.field4745, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field4783, this.field4768, this.field4770, this.field4776, var10);
        }
        this.method7315(arg0, arg1, arg2, arg3, var8, var9);
        if (client.method3130() && this.field4791 && this.field4790 != null) {
            this.field4746.method6525("Coord: " + this.field4790, class477.field4989 + 10, class477.field4987 + 20, 16776960, -1);
        }
        this.field4761 = var8;
        this.field4762 = var9;
        this.field4760 = arg0;
        this.field4764 = arg1;
        class477.method8115(var6);
    }

    @ObfuscatedName("pb.c(IIIIIII)Z")
    public boolean method7354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4748 == null) {
            return true;
        } else if (this.field4748.field5011 != arg0 || this.field4748.field5010 != arg1) {
            return true;
        } else if (this.field4736.field2893 != this.field4793) {
            return true;
        } else if (client.field802 != this.field4780) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("pb.p(IIIIIIB)V")
    public void method7315(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field242 == null) {
            return;
        }
        int var7 = 512 / (this.field4736.field2893 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method7369() - arg4 / 2 - var7;
        int var14 = this.method7303() - arg5 / 2 - var7;
        int var15 = arg0 - this.field4736.field2893 * (var7 + var13 - this.field4795);
        int var16 = arg1 - this.field4736.field2893 * (var7 - (var14 - this.field4737));
        if (this.method7354(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field4748 != null && this.field4748.field5011 == var11 && this.field4748.field5010 == var12) {
                Arrays.fill(this.field4748.field5021, 0);
            } else {
                this.field4748 = new class481(var11, var12);
            }
            this.field4795 = this.method7369() - arg4 / 2 - var7;
            this.field4737 = this.method7303() - arg5 / 2 - var7;
            this.field4793 = this.field4736.field2893;
            Statics.field242.method6044(this.field4795, this.field4737, this.field4748, (float) this.field4793 / var10);
            this.field4780 = client.field802;
            var15 = arg0 - this.field4736.field2893 * (var7 + var13 - this.field4795);
            var16 = arg1 - this.field4736.field2893 * (var7 - (var14 - this.field4737));
        }
        class477.method8171(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field4748.method8246(var15, var16, 192);
        } else {
            this.field4748.method8248(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("pb.d(IIIIS)V")
    public void method7319(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field4754.method7257()) {
            return;
        }
        if (!this.field4736.method4702()) {
            this.field4736.method4722(this.field4740, this.field4751.method4511(), client.field510);
            if (!this.field4736.method4702()) {
                return;
            }
        }
        this.field4736.method4699(arg0, arg1, arg2, arg3, this.field4768, this.field4770, this.field4776);
    }

    @ObfuscatedName("pb.y(II)V")
    public void method7292(int arg0) {
        this.field4766 = this.method7294(arg0);
    }

    @ObfuscatedName("pb.z(IIIIII)V")
    public void method7293(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class477.method8120(arg0, arg1, arg2, arg3, -16777216);
        class477.method8111(var7 - 152, var8, 304, 34, -65536);
        class477.method8120(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field4746.method6528(class326.field4138, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("pb.w(II)F")
    public float method7294(int arg0) {
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

    @ObfuscatedName("pb.as(B)I")
    public int method7295() {
        if ((double) this.field4766 == 1.0D) {
            return 25;
        } else if ((double) this.field4766 == 1.5D) {
            return 37;
        } else if ((double) this.field4766 == 2.0D) {
            return 50;
        } else if ((double) this.field4766 == 3.0D) {
            return 75;
        } else if ((double) this.field4766 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("pb.ad(S)V")
    public void method7296() {
        this.field4754.method7260();
    }

    @ObfuscatedName("pb.ao(B)Z")
    public boolean method7423() {
        return this.field4754.method7257();
    }

    @ObfuscatedName("pb.am(II)Lit;")
    public class238 method7298(int arg0) {
        Iterator var2 = this.field4749.values().iterator();
        class238 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class238) var2.next();
        } while (var3.method4509() != arg0);
        return var3;
    }

    @ObfuscatedName("pb.av(III)V")
    public void method7358(int arg0, int arg1) {
        if (this.field4751 != null && this.field4751.method4510(arg0, arg1)) {
            this.field4757 = arg0 - this.field4751.method4527() * 64;
            this.field4758 = arg1 - this.field4751.method4517() * 64;
        }
    }

    @ObfuscatedName("pb.au(IIS)V")
    public void method7300(int arg0, int arg1) {
        if (this.field4751 != null) {
            this.method7277(arg0 - this.field4751.method4527() * 64, arg1 - this.field4751.method4517() * 64, true);
            this.field4757 = -1;
            this.field4758 = -1;
        }
    }

    @ObfuscatedName("pb.ar(IIIB)V")
    public void method7299(int arg0, int arg1, int arg2) {
        if (this.field4751 != null) {
            int[] var4 = this.field4751.method4539(arg0, arg1, arg2);
            if (var4 != null) {
                this.method7358(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("pb.at(IIII)V")
    public void method7386(int arg0, int arg1, int arg2) {
        if (this.field4751 != null) {
            int[] var4 = this.field4751.method4539(arg0, arg1, arg2);
            if (var4 != null) {
                this.method7300(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("pb.ay(I)I")
    public int method7369() {
        return this.field4751 == null ? -1 : this.field4755 + this.field4751.method4527() * 64;
    }

    @ObfuscatedName("pb.an(I)I")
    public int method7303() {
        return this.field4751 == null ? -1 : this.field4745 + this.field4751.method4517() * 64;
    }

    @ObfuscatedName("pb.ab(I)Lky;")
    public class297 method7453() {
        return this.field4751 == null ? null : this.field4751.method4507(this.method7369(), this.method7303());
    }

    @ObfuscatedName("pb.al(B)I")
    public int method7305() {
        return this.field4761;
    }

    @ObfuscatedName("pb.ag(I)I")
    public int method7306() {
        return this.field4762;
    }

    @ObfuscatedName("pb.az(II)V")
    public void method7307(int arg0) {
        if (arg0 >= 1) {
            this.field4763 = arg0;
        }
    }

    @ObfuscatedName("pb.ak(I)V")
    public void method7308() {
        this.field4763 = 3;
    }

    @ObfuscatedName("pb.af(II)V")
    public void method7399(int arg0) {
        if (arg0 >= 1) {
            this.field4776 = arg0;
        }
    }

    @ObfuscatedName("pb.ai(I)V")
    public void method7437() {
        this.field4776 = 50;
    }

    @ObfuscatedName("pb.ax(ZB)V")
    public void method7311(boolean arg0) {
        this.field4767 = arg0;
    }

    @ObfuscatedName("pb.ah(IB)V")
    public void method7312(int arg0) {
        this.field4768 = new HashSet();
        this.field4768.add(arg0);
        this.field4769 = 0;
        this.field4770 = 0;
    }

    @ObfuscatedName("pb.aw(II)V")
    public void method7313(int arg0) {
        this.field4768 = new HashSet();
        this.field4769 = 0;
        this.field4770 = 0;
        for (int var2 = 0; var2 < Statics.field1928; var2++) {
            if (class179.method3153(var2) != null && class179.method3153(var2).field1950 == arg0) {
                this.field4768.add(class179.method3153(var2).field1930);
            }
        }
    }

    @ObfuscatedName("pb.aj(I)V")
    public void method7314() {
        this.field4768 = null;
    }

    @ObfuscatedName("pb.aq(ZI)V")
    public void method7276(boolean arg0) {
        this.field4784 = !arg0;
    }

    @ObfuscatedName("pb.ap(IZB)V")
    public void method7316(int arg0, boolean arg1) {
        if (arg1) {
            this.field4771.remove(arg0);
        } else {
            this.field4771.add(arg0);
        }
        this.method7321();
    }

    @ObfuscatedName("pb.aa(IZI)V")
    public void method7317(int arg0, boolean arg1) {
        if (arg1) {
            this.field4756.remove(arg0);
        } else {
            this.field4756.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field1928; var3++) {
            if (class179.method3153(var3) != null && class179.method3153(var3).field1950 == arg0) {
                int var4 = class179.method3153(var3).field1930;
                if (arg1) {
                    this.field4782.remove(var4);
                } else {
                    this.field4782.add(var4);
                }
            }
        }
        this.method7321();
    }

    @ObfuscatedName("pb.ae(S)Z")
    public boolean method7318() {
        return !this.field4784;
    }

    @ObfuscatedName("pb.ac(II)Z")
    public boolean method7457(int arg0) {
        return !this.field4771.contains(arg0);
    }

    @ObfuscatedName("pb.bh(IB)Z")
    public boolean method7380(int arg0) {
        return !this.field4756.contains(arg0);
    }

    @ObfuscatedName("pb.by(I)V")
    public void method7321() {
        this.field4783.clear();
        this.field4783.addAll(this.field4771);
        this.field4783.addAll(this.field4782);
    }

    @ObfuscatedName("pb.bw(IIIIIII)V")
    public void method7322(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field4754.method7257()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field4759));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field4759));
        List var9 = this.field4736.method4700(this.field4755 - var7 / 2 - 1, this.field4745 - var8 / 2 - 1, var7 / 2 + this.field4755 + 1, var8 / 2 + this.field4745 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
        if (var9.isEmpty()) {
            return;
        }
        Iterator var10 = var9.iterator();
        boolean var13;
        do {
            if (!var10.hasNext()) {
                return;
            }
            class256 var11 = (class256) var10.next();
            class179 var12 = class179.method3153(var11.method4455());
            var13 = false;
            for (int var14 = this.field4796.length - 1; var14 >= 0; var14--) {
                if (var12.field1939[var14] != null) {
                    client.method1764(var12.field1939[var14], var12.field1940, this.field4796[var14], var11.method4455(), var11.field3000.method5225(), var11.field3003.method5225());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("pb.bp(ILky;I)Lky;")
    public class297 method7323(int arg0, class297 arg1) {
        if (!this.field4754.method7257()) {
            return null;
        } else if (!this.field4736.method4702()) {
            return null;
        } else if (this.field4751.method4510(arg1.field3451, arg1.field3452)) {
            HashMap var3 = this.field4736.method4703();
            List var4 = (List) var3.get(arg0);
            if (var4 == null || var4.isEmpty()) {
                return null;
            }
            class256 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();
            while (true) {
                class256 var8;
                int var11;
                do {
                    if (!var7.hasNext()) {
                        return var5.field3003;
                    }
                    var8 = (class256) var7.next();
                    int var9 = var8.field3003.field3451 - arg1.field3451;
                    int var10 = var8.field3003.field3452 - arg1.field3452;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field3003;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("pb.bc(IILky;Lky;I)V")
    public void method7419(int arg0, int arg1, class297 arg2, class297 arg3) {
        class85 var5 = new class85();
        class261 var6 = new class261(arg1, arg2, arg3);
        var5.method2139(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method2140(10);
                break;
            case 1009:
                var5.method2140(11);
                break;
            case 1010:
                var5.method2140(12);
                break;
            case 1011:
                var5.method2140(13);
                break;
            case 1012:
                var5.method2140(14);
        }
        class68.method3219(var5);
    }

    @ObfuscatedName("pb.bl(I)Lix;")
    public class256 method7325() {
        if (!this.field4754.method7257()) {
            return null;
        } else if (this.field4736.method4702()) {
            HashMap var1 = this.field4736.method4703();
            this.field4787 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field4787.addAll(var3);
            }
            this.field4788 = this.field4787.iterator();
            return this.method7415();
        } else {
            return null;
        }
    }

    @ObfuscatedName("pb.bv(I)Lix;")
    public class256 method7415() {
        if (this.field4788 == null) {
            return null;
        }
        class256 var1;
        do {
            if (!this.field4788.hasNext()) {
                return null;
            }
            var1 = (class256) this.field4788.next();
        } while (var1.method4455() == -1);
        return var1;
    }
}
