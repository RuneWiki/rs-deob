package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ov")
public class class414 {

    @ObfuscatedName("ov.s")
    public class316 field4459;

    @ObfuscatedName("ov.l")
    public class316 field4492;

    @ObfuscatedName("ov.q")
    public class316 field4461;

    @ObfuscatedName("ov.o")
    public static final class416 field4462 = class416.field4523;

    @ObfuscatedName("ov.r")
    public static final class416 field4474 = class416.field4524;

    @ObfuscatedName("ov.p")
    public static final class416 field4464 = class416.field4521;

    @ObfuscatedName("ov.w")
    public class344 field4509;

    @ObfuscatedName("ov.k")
    public HashMap field4466;

    @ObfuscatedName("ov.d")
    public class450[] field4498;

    @ObfuscatedName("ov.m")
    public HashMap field4468;

    @ObfuscatedName("ov.u")
    public class201 field4476;

    @ObfuscatedName("ov.t")
    public class201 field4470;

    @ObfuscatedName("ov.g")
    public class201 field4471;

    @ObfuscatedName("ov.x")
    public class203 field4472;

    @ObfuscatedName("ov.a")
    public class413 field4473;

    @ObfuscatedName("ov.y")
    public int field4490;

    @ObfuscatedName("ov.j")
    public int field4475;

    @ObfuscatedName("ov.e")
    public int field4499 = -1;

    @ObfuscatedName("ov.z")
    public int field4480 = -1;

    @ObfuscatedName("ov.h")
    public float field4478;

    @ObfuscatedName("ov.ae")
    public float field4513;

    @ObfuscatedName("ov.aq")
    public int field4496 = -1;

    @ObfuscatedName("ov.aw")
    public int field4481 = -1;

    @ObfuscatedName("ov.am")
    public int field4482 = -1;

    @ObfuscatedName("ov.ak")
    public int field4487 = -1;

    @ObfuscatedName("ov.ao")
    public int field4484 = 3;

    @ObfuscatedName("ov.aj")
    public int field4485 = 50;

    @ObfuscatedName("ov.al")
    public boolean field4486 = false;

    @ObfuscatedName("ov.av")
    public HashSet field4460 = null;

    @ObfuscatedName("ov.at")
    public int field4505 = -1;

    @ObfuscatedName("ov.an")
    public int field4489 = -1;

    @ObfuscatedName("ov.ay")
    public int field4479 = -1;

    @ObfuscatedName("ov.ag")
    public int field4491 = -1;

    @ObfuscatedName("ov.ah")
    public int field4477 = -1;

    @ObfuscatedName("ov.ac")
    public int field4493 = -1;

    @ObfuscatedName("ov.ab")
    public long field4494;

    @ObfuscatedName("ov.au")
    public int field4495;

    @ObfuscatedName("ov.af")
    public int field4488;

    @ObfuscatedName("ov.ad")
    public boolean field4497 = true;

    @ObfuscatedName("ov.ar")
    public HashSet field4465 = new HashSet();

    @ObfuscatedName("ov.ap")
    public HashSet field4467 = new HashSet();

    @ObfuscatedName("ov.az")
    public HashSet field4500 = new HashSet();

    @ObfuscatedName("ov.as")
    public HashSet field4501 = new HashSet();

    @ObfuscatedName("ov.aa")
    public boolean field4502 = false;

    @ObfuscatedName("ov.bj")
    public int field4503 = 0;

    @ObfuscatedName("ov.br")
    public final int[] field4504 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("ov.bo")
    public List field4469;

    @ObfuscatedName("ov.bl")
    public Iterator field4506;

    @ObfuscatedName("ov.be")
    public HashSet field4507 = new HashSet();

    @ObfuscatedName("ov.bh")
    public class290 field4508 = null;

    @ObfuscatedName("ov.bf")
    public boolean field4456 = false;

    @ObfuscatedName("ov.bb")
    public class451 field4510;

    @ObfuscatedName("ov.bw")
    public int field4511;

    @ObfuscatedName("ov.bx")
    public int field4512 = -1;

    @ObfuscatedName("ov.bg")
    public int field4463 = -1;

    @ObfuscatedName("ov.bn")
    public int field4514 = -1;

    @ObfuscatedName("ov.v(Lln;Lln;Lln;Lmd;Ljava/util/HashMap;[Lqq;B)V")
    public void method6542(class316 arg0, class316 arg1, class316 arg2, class344 arg3, HashMap arg4, class450[] arg5) {
        this.field4498 = arg5;
        this.field4459 = arg0;
        this.field4492 = arg1;
        this.field4461 = arg2;
        this.field4509 = arg3;
        this.field4466 = new HashMap();
        this.field4466.put(class198.field2210, arg4.get(field4462));
        this.field4466.put(class198.field2208, arg4.get(field4474));
        this.field4466.put(class198.field2207, arg4.get(field4464));
        this.field4473 = new class413(arg0);
        int var7 = this.field4459.method5293(class220.field2414.field2416);
        int[] var8 = this.field4459.method5304(var7);
        this.field4468 = new HashMap(var8.length);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class438 var10 = new class438(this.field4459.method5296(var7, var8[var9]));
            class201 var11 = new class201();
            var11.method3674(var10, var8[var9]);
            this.field4468.put(var11.method3677(), var11);
            if (var11.method3624()) {
                this.field4476 = var11;
            }
        }
        this.method6616(this.field4476);
        this.field4471 = null;
    }

    @ObfuscatedName("ov.c(B)V")
    public void method6543() {
        class202.field2265.method4626(5);
    }

    @ObfuscatedName("ov.i(IIZIIIIB)V")
    public void method6544(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field4473.method6529()) {
            return;
        }
        this.method6547();
        this.method6596();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field4478));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field4478));
        List var10 = this.field4472.method3841(this.field4490 - var8 / 2 - 1, this.field4475 - var9 / 2 - 1, var8 / 2 + this.field4490 + 1, var9 / 2 + this.field4475 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class219 var13 = (class219) var12.next();
            var11.add(var13);
            class81 var14 = new class81();
            class224 var15 = new class224(var13.method3567(), var13.field2409, var13.field2413);
            var14.method1994(new Object[] { var15, arg0, arg1 });
            if (this.field4507.contains(var13)) {
                var14.method1995(17);
            } else {
                var14.method1995(15);
            }
            class64.method2809(var14);
        }
        Iterator var16 = this.field4507.iterator();
        while (var16.hasNext()) {
            class219 var17 = (class219) var16.next();
            if (!var11.contains(var17)) {
                class81 var18 = new class81();
                class224 var19 = new class224(var17.method3567(), var17.field2409, var17.field2413);
                var18.method1994(new Object[] { var19, arg0, arg1 });
                var18.method1995(16);
                class64.method2809(var18);
            }
        }
        this.field4507 = var11;
    }

    @ObfuscatedName("ov.f(IIZZB)V")
    public void method6545(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class270.method2724();
        this.method6546(arg0, arg1, arg3, var5);
        if (!this.method6575() && arg3 || arg2) {
            if (arg3) {
                this.field4477 = arg0;
                this.field4493 = arg1;
                this.field4479 = this.field4490;
                this.field4491 = this.field4475;
            }
            if (this.field4479 != -1) {
                int var7 = arg0 - this.field4477;
                int var8 = arg1 - this.field4493;
                this.method6549(this.field4479 - (int) ((float) var7 / this.field4513), this.field4491 + (int) ((float) var8 / this.field4513), false);
            }
        } else {
            this.method6550();
        }
        if (arg3) {
            this.field4494 = var5;
            this.field4495 = arg0;
            this.field4488 = arg1;
        }
    }

    @ObfuscatedName("ov.b(IIZJ)V")
    public void method6546(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field4470 == null) {
            this.field4508 = null;
            return;
        }
        int var6 = (int) ((float) this.field4490 + ((float) (arg0 - this.field4482) - (float) this.method6661() * this.field4478 / 2.0F) / this.field4478);
        int var7 = (int) ((float) this.field4475 - ((float) (arg1 - this.field4487) - (float) this.method6580() * this.field4478 / 2.0F) / this.field4478);
        this.field4508 = this.field4470.method3617(var6 + this.field4470.method3629() * 64, var7 + this.field4470.method3631() * 64);
        if (this.field4508 == null || !arg2) {
            return;
        }
        if (client.method2529() && class24.field130[82] && class24.field130[81]) {
            client.method3282(this.field4508.field3287, this.field4508.field3286, this.field4508.field3288, false);
            return;
        }
        boolean var8 = true;
        if (this.field4497) {
            int var9 = arg0 - this.field4495;
            int var10 = arg1 - this.field4488;
            if (arg3 - this.field4494 > 500L || var9 < -25 || var9 > 25 || var10 < -25 || var10 > 25) {
                var8 = false;
            }
        }
        if (var8) {
            class265 var11 = class265.method3935(class263.field2949, client.field685.field1328);
            var11.field3019.method6957(this.field4508.method4980());
            client.field685.method2395(var11);
            this.field4494 = 0L;
        }
    }

    @ObfuscatedName("ov.n(I)V")
    public void method6547() {
        if (Statics.field1842 != null) {
            this.field4478 = this.field4513;
            return;
        }
        if (this.field4478 < this.field4513) {
            this.field4478 = Math.min(this.field4513, this.field4478 / 30.0F + this.field4478);
        }
        if (this.field4478 > this.field4513) {
            this.field4478 = Math.max(this.field4513, this.field4478 - this.field4478 / 30.0F);
        }
    }

    @ObfuscatedName("ov.s(I)V")
    public void method6596() {
        if (!this.method6575()) {
            return;
        }
        int var1 = this.field4499 - this.field4490;
        int var2 = this.field4480 - this.field4475;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method6549(this.field4490 + var1, this.field4475 + var2, true);
        if (this.field4499 == this.field4490 && this.field4480 == this.field4475) {
            this.field4499 = -1;
            this.field4480 = -1;
        }
    }

    @ObfuscatedName("ov.l(IIZI)V")
    public final void method6549(int arg0, int arg1, boolean arg2) {
        this.field4490 = arg0;
        this.field4475 = arg1;
        class270.method2724();
        if (arg2) {
            this.method6550();
        }
    }

    @ObfuscatedName("ov.q(B)V")
    public final void method6550() {
        this.field4493 = -1;
        this.field4477 = -1;
        this.field4491 = -1;
        this.field4479 = -1;
    }

    @ObfuscatedName("ov.o(I)Z")
    public boolean method6575() {
        return this.field4499 != -1 && this.field4480 != -1;
    }

    @ObfuscatedName("ov.r(IIII)Lgu;")
    public class201 method6552(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field4468.values().iterator();
        class201 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class201) var4.next();
        } while (!var5.method3637(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("ov.p(IIIZB)V")
    public void method6655(int arg0, int arg1, int arg2, boolean arg3) {
        class201 var5 = this.method6552(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field4476;
        }
        boolean var6 = false;
        if (this.field4471 != var5 || arg3) {
            this.field4471 = var5;
            this.method6616(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method6560(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ov.w(IB)V")
    public void method6554(int arg0) {
        class201 var2 = this.method6614(arg0);
        if (var2 != null) {
            this.method6616(var2);
        }
    }

    @ObfuscatedName("ov.k(I)I")
    public int method6555() {
        return this.field4470 == null ? -1 : this.field4470.method3623();
    }

    @ObfuscatedName("ov.d(I)Lgu;")
    public class201 method6553() {
        return this.field4470;
    }

    @ObfuscatedName("ov.m(Lgu;B)V")
    public void method6616(class201 arg0) {
        if (this.field4470 == null || this.field4470 != arg0) {
            this.method6558(arg0);
            this.method6560(-1, -1, -1);
        }
    }

    @ObfuscatedName("ov.u(Lgu;I)V")
    public void method6558(class201 arg0) {
        this.field4470 = arg0;
        this.field4472 = new class203(this.field4498, this.field4466, this.field4492, this.field4461);
        this.field4473.method6527(this.field4470.method3677());
    }

    @ObfuscatedName("ov.t(Lgu;Lks;Lks;ZI)V")
    public void method6559(class201 arg0, class290 arg1, class290 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field4470 == null || this.field4470 != arg0) {
            this.method6558(arg0);
        }
        if (!arg3 && this.field4470.method3637(arg1.field3288, arg1.field3287, arg1.field3286)) {
            this.method6560(arg1.field3288, arg1.field3287, arg1.field3286);
        } else {
            this.method6560(arg2.field3288, arg2.field3287, arg2.field3286);
        }
    }

    @ObfuscatedName("ov.g(IIII)V")
    public void method6560(int arg0, int arg1, int arg2) {
        if (this.field4470 == null) {
            return;
        }
        int[] var4 = this.field4470.method3621(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field4470.method3621(this.field4470.method3625(), this.field4470.method3690(), this.field4470.method3635());
        }
        this.method6549(var4[0] - this.field4470.method3629() * 64, var4[1] - this.field4470.method3631() * 64, true);
        this.field4499 = -1;
        this.field4480 = -1;
        this.field4478 = this.method6567(this.field4470.method3615());
        this.field4513 = this.field4478;
        this.field4469 = null;
        this.field4506 = null;
        this.field4472.method3853();
    }

    @ObfuscatedName("ov.x(IIIIIB)V")
    public void method6561(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class447.method7313(var6);
        class447.method7250(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class447.method7249(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field4473.method6528();
        if (var7 < 100) {
            this.method6670(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field4472.method3828()) {
            this.field4472.method3821(this.field4459, this.field4470.method3677(), client.field495);
            if (!this.field4472.method3828()) {
                return;
            }
        }
        if (this.field4460 != null) {
            this.field4489++;
            if (this.field4489 % this.field4485 == 0) {
                this.field4489 = 0;
                this.field4505++;
            }
            if (this.field4505 >= this.field4484 && !this.field4486) {
                this.field4460 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field4478));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field4478));
        this.field4472.method3823(this.field4490 - var8 / 2, this.field4475 - var9 / 2, var8 / 2 + this.field4490, var9 / 2 + this.field4475, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field4502) {
            boolean var10 = false;
            if (arg4 - this.field4503 > 100) {
                this.field4503 = arg4;
                var10 = true;
            }
            this.field4472.method3820(this.field4490 - var8 / 2, this.field4475 - var9 / 2, var8 / 2 + this.field4490, var9 / 2 + this.field4475, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field4501, this.field4460, this.field4489, this.field4485, var10);
        }
        this.method6625(arg0, arg1, arg2, arg3, var8, var9);
        if (client.method2529() && this.field4456 && this.field4508 != null) {
            this.field4509.method5782("Coord: " + this.field4508, class447.field4690 + 10, class447.field4688 + 20, 16776960, -1);
        }
        this.field4496 = var8;
        this.field4481 = var9;
        this.field4482 = arg0;
        this.field4487 = arg1;
        class447.method7253(var6);
    }

    @ObfuscatedName("ov.a(IIIIIII)Z")
    public boolean method6562(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4510 == null) {
            return true;
        } else if (this.field4510.field4719 != arg0 || this.field4510.field4710 != arg1) {
            return true;
        } else if (this.field4472.field2281 != this.field4511) {
            return true;
        } else if (client.field780 != this.field4514) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ov.y(IIIIIII)V")
    public void method6625(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field1842 == null) {
            return;
        }
        int var7 = 512 / (this.field4472.field2281 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method6576() - arg4 / 2 - var7;
        int var14 = this.method6577() - arg5 / 2 - var7;
        int var15 = arg0 - this.field4472.field2281 * (var7 + var13 - this.field4512);
        int var16 = arg1 - this.field4472.field2281 * (var7 - (var14 - this.field4463));
        if (this.method6562(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field4510 != null && this.field4510.field4719 == var11 && this.field4510.field4710 == var12) {
                Arrays.fill(this.field4510.field4717, 0);
            } else {
                this.field4510 = new class451(var11, var12);
            }
            this.field4512 = this.method6576() - arg4 / 2 - var7;
            this.field4463 = this.method6577() - arg5 / 2 - var7;
            this.field4511 = this.field4472.field2281;
            Statics.field1842.method5468(this.field4512, this.field4463, this.field4510, (float) this.field4511 / var10);
            this.field4514 = client.field780;
            var15 = arg0 - this.field4472.field2281 * (var7 + var13 - this.field4512);
            var16 = arg1 - this.field4472.field2281 * (var7 - (var14 - this.field4463));
        }
        class447.method7257(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field4510.method7379(var15, var16, 192);
        } else {
            this.field4510.method7382(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("ov.j(IIIII)V")
    public void method6705(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field4473.method6529()) {
            return;
        }
        if (!this.field4472.method3828()) {
            this.field4472.method3821(this.field4459, this.field4470.method3677(), client.field495);
            if (!this.field4472.method3828()) {
                return;
            }
        }
        this.field4472.method3825(arg0, arg1, arg2, arg3, this.field4460, this.field4489, this.field4485);
    }

    @ObfuscatedName("ov.e(II)V")
    public void method6565(int arg0) {
        this.field4513 = this.method6567(arg0);
    }

    @ObfuscatedName("ov.z(IIIIII)V")
    public void method6670(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class447.method7249(arg0, arg1, arg2, arg3, -16777216);
        class447.method7262(var7 - 152, var8, 304, 34, -65536);
        class447.method7249(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field4509.method5750(class309.field3851, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("ov.h(II)F")
    public float method6567(int arg0) {
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

    @ObfuscatedName("ov.ae(I)I")
    public int method6568() {
        if ((double) this.field4513 == 1.0D) {
            return 25;
        } else if ((double) this.field4513 == 1.5D) {
            return 37;
        } else if ((double) this.field4513 == 2.0D) {
            return 50;
        } else if ((double) this.field4513 == 3.0D) {
            return 75;
        } else if ((double) this.field4513 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("ov.aq(I)V")
    public void method6569() {
        this.field4473.method6531();
    }

    @ObfuscatedName("ov.aw(B)Z")
    public boolean method6570() {
        return this.field4473.method6529();
    }

    @ObfuscatedName("ov.am(IB)Lgu;")
    public class201 method6614(int arg0) {
        Iterator var2 = this.field4468.values().iterator();
        class201 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class201) var2.next();
        } while (var3.method3623() != arg0);
        return var3;
    }

    @ObfuscatedName("ov.ak(III)V")
    public void method6591(int arg0, int arg1) {
        if (this.field4470 != null && this.field4470.method3619(arg0, arg1)) {
            this.field4499 = arg0 - this.field4470.method3629() * 64;
            this.field4480 = arg1 - this.field4470.method3631() * 64;
        }
    }

    @ObfuscatedName("ov.ao(III)V")
    public void method6573(int arg0, int arg1) {
        if (this.field4470 != null) {
            this.method6549(arg0 - this.field4470.method3629() * 64, arg1 - this.field4470.method3631() * 64, true);
            this.field4499 = -1;
            this.field4480 = -1;
        }
    }

    @ObfuscatedName("ov.aj(IIIB)V")
    public void method6574(int arg0, int arg1, int arg2) {
        if (this.field4470 != null) {
            int[] var4 = this.field4470.method3621(arg0, arg1, arg2);
            if (var4 != null) {
                this.method6591(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("ov.al(IIIB)V")
    public void method6607(int arg0, int arg1, int arg2) {
        if (this.field4470 != null) {
            int[] var4 = this.field4470.method3621(arg0, arg1, arg2);
            if (var4 != null) {
                this.method6573(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("ov.av(I)I")
    public int method6576() {
        return this.field4470 == null ? -1 : this.field4490 + this.field4470.method3629() * 64;
    }

    @ObfuscatedName("ov.at(B)I")
    public int method6577() {
        return this.field4470 == null ? -1 : this.field4475 + this.field4470.method3631() * 64;
    }

    @ObfuscatedName("ov.an(S)Lks;")
    public class290 method6578() {
        return this.field4470 == null ? null : this.field4470.method3617(this.method6576(), this.method6577());
    }

    @ObfuscatedName("ov.ay(B)I")
    public int method6661() {
        return this.field4496;
    }

    @ObfuscatedName("ov.ag(I)I")
    public int method6580() {
        return this.field4481;
    }

    @ObfuscatedName("ov.ah(II)V")
    public void method6730(int arg0) {
        if (arg0 >= 1) {
            this.field4484 = arg0;
        }
    }

    @ObfuscatedName("ov.ac(B)V")
    public void method6681() {
        this.field4484 = 3;
    }

    @ObfuscatedName("ov.ab(II)V")
    public void method6583(int arg0) {
        if (arg0 >= 1) {
            this.field4485 = arg0;
        }
    }

    @ObfuscatedName("ov.au(B)V")
    public void method6584() {
        this.field4485 = 50;
    }

    @ObfuscatedName("ov.af(ZI)V")
    public void method6699(boolean arg0) {
        this.field4486 = arg0;
    }

    @ObfuscatedName("ov.ad(II)V")
    public void method6586(int arg0) {
        this.field4460 = new HashSet();
        this.field4460.add(arg0);
        this.field4505 = 0;
        this.field4489 = 0;
    }

    @ObfuscatedName("ov.ai(IB)V")
    public void method6587(int arg0) {
        this.field4460 = new HashSet();
        this.field4505 = 0;
        this.field4489 = 0;
        for (int var2 = 0; var2 < Statics.field1825; var2++) {
            if (class172.method2469(var2) != null && class172.method2469(var2).field1836 == arg0) {
                this.field4460.add(class172.method2469(var2).field1831);
            }
        }
    }

    @ObfuscatedName("ov.ax(I)V")
    public void method6694() {
        this.field4460 = null;
    }

    @ObfuscatedName("ov.ar(ZI)V")
    public void method6589(boolean arg0) {
        this.field4502 = !arg0;
    }

    @ObfuscatedName("ov.ap(IZI)V")
    public void method6623(int arg0, boolean arg1) {
        if (arg1) {
            this.field4465.remove(arg0);
        } else {
            this.field4465.add(arg0);
        }
        this.method6724();
    }

    @ObfuscatedName("ov.az(IZB)V")
    public void method6541(int arg0, boolean arg1) {
        if (arg1) {
            this.field4467.remove(arg0);
        } else {
            this.field4467.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field1825; var3++) {
            if (class172.method2469(var3) != null && class172.method2469(var3).field1836 == arg0) {
                int var4 = class172.method2469(var3).field1831;
                if (arg1) {
                    this.field4500.remove(var4);
                } else {
                    this.field4500.add(var4);
                }
            }
        }
        this.method6724();
    }

    @ObfuscatedName("ov.as(B)Z")
    public boolean method6592() {
        return !this.field4502;
    }

    @ObfuscatedName("ov.aa(IB)Z")
    public boolean method6593(int arg0) {
        return !this.field4465.contains(arg0);
    }

    @ObfuscatedName("ov.bj(IB)Z")
    public boolean method6594(int arg0) {
        return !this.field4467.contains(arg0);
    }

    @ObfuscatedName("ov.bm(I)V")
    public void method6724() {
        this.field4501.clear();
        this.field4501.addAll(this.field4465);
        this.field4501.addAll(this.field4500);
    }

    @ObfuscatedName("ov.br(IIIIIII)V")
    public void method6715(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field4473.method6529()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field4478));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field4478));
        List var9 = this.field4472.method3841(this.field4490 - var7 / 2 - 1, this.field4475 - var8 / 2 - 1, var7 / 2 + this.field4490 + 1, var8 / 2 + this.field4475 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
        if (var9.isEmpty()) {
            return;
        }
        Iterator var10 = var9.iterator();
        boolean var13;
        do {
            if (!var10.hasNext()) {
                return;
            }
            class219 var11 = (class219) var10.next();
            class172 var12 = class172.method2469(var11.method3567());
            var13 = false;
            for (int var14 = this.field4504.length - 1; var14 >= 0; var14--) {
                if (var12.field1834[var14] != null) {
                    client.method299(var12.field1834[var14], var12.field1821, this.field4504[var14], var11.method3567(), var11.field2409.method4980(), var11.field2413.method4980());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("ov.bo(ILks;I)Lks;")
    public class290 method6597(int arg0, class290 arg1) {
        if (!this.field4473.method6529()) {
            return null;
        } else if (!this.field4472.method3828()) {
            return null;
        } else if (this.field4470.method3619(arg1.field3287, arg1.field3286)) {
            HashMap var3 = this.field4472.method3829();
            List var4 = (List) var3.get(arg0);
            if (var4 == null || var4.isEmpty()) {
                return null;
            }
            class219 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();
            while (true) {
                class219 var8;
                int var11;
                do {
                    if (!var7.hasNext()) {
                        return var5.field2413;
                    }
                    var8 = (class219) var7.next();
                    int var9 = var8.field2413.field3287 - arg1.field3287;
                    int var10 = var8.field2413.field3286 - arg1.field3286;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field2413;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("ov.bl(IILks;Lks;B)V")
    public void method6581(int arg0, int arg1, class290 arg2, class290 arg3) {
        class81 var5 = new class81();
        class224 var6 = new class224(arg1, arg2, arg3);
        var5.method1994(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1995(10);
                break;
            case 1009:
                var5.method1995(11);
                break;
            case 1010:
                var5.method1995(12);
                break;
            case 1011:
                var5.method1995(13);
                break;
            case 1012:
                var5.method1995(14);
        }
        class64.method2809(var5);
    }

    @ObfuscatedName("ov.be(I)Lhq;")
    public class219 method6666() {
        if (!this.field4473.method6529()) {
            return null;
        } else if (this.field4472.method3828()) {
            HashMap var1 = this.field4472.method3829();
            this.field4469 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field4469.addAll(var3);
            }
            this.field4506 = this.field4469.iterator();
            return this.method6600();
        } else {
            return null;
        }
    }

    @ObfuscatedName("ov.bb(I)Lhq;")
    public class219 method6600() {
        if (this.field4506 == null) {
            return null;
        }
        class219 var1;
        do {
            if (!this.field4506.hasNext()) {
                return null;
            }
            var1 = (class219) this.field4506.next();
        } while (var1.method3567() == -1);
        return var1;
    }
}
