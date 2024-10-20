package deob;

import java.util.ArrayList;

@ObfuscatedName("np")
public class class373 {

    @ObfuscatedName("np.c")
    public int field4395 = Integer.MAX_VALUE;

    @ObfuscatedName("np.r")
    public int field4400 = 0;

    @ObfuscatedName("np.b")
    public boolean field4397 = true;

    @ObfuscatedName("np.m")
    public boolean field4392 = true;

    @ObfuscatedName("np.t")
    public class376 field4399;

    @ObfuscatedName("np.h")
    public ArrayList field4390 = new ArrayList();

    @ObfuscatedName("np.p")
    public int field4401 = 0;

    @ObfuscatedName("np.o")
    public int field4402 = 0;

    @ObfuscatedName("np.f(IB)Lnq;")
    public class375 method6509(int arg0) {
        return (class375) this.field4390.get(arg0);
    }

    @ObfuscatedName("np.w(I)Lnq;")
    public class375 method6532() {
        return this.field4390.size() == 0 ? null : (class375) this.field4390.get(this.field4390.size() - 1);
    }

    @ObfuscatedName("np.v(B)Z")
    public boolean method6511() {
        return this.field4390.size() == 0;
    }

    @ObfuscatedName("np.s(I)I")
    public int method6608() {
        return this.field4390.size();
    }

    @ObfuscatedName("np.z(S)Ljava/lang/String;")
    public String method6513() {
        if (this.method6511()) {
            return "";
        }
        StringBuilder var1 = new StringBuilder(this.method6608());
        for (int var2 = 0; var2 < this.method6608(); var2++) {
            class375 var3 = this.method6509(var2);
            var1.append(var3.field4412);
        }
        return var1.toString();
    }

    @ObfuscatedName("np.j(IZI)V")
    public void method6514(int arg0, boolean arg1) {
        if (this.field4399 != null && arg0 < this.field4399.field4419 * 2) {
            arg0 = Integer.MAX_VALUE;
        }
        if (this.field4395 != arg0 || this.field4397 != arg1) {
            this.field4395 = arg0;
            this.field4397 = arg1;
            this.method6537(0, this.field4390.size(), false);
        }
    }

    @ObfuscatedName("np.i(IB)V")
    public void method6515(int arg0) {
        if (this.field4402 != arg0) {
            this.field4402 = arg0;
            this.method6537(0, this.field4390.size(), false);
        }
    }

    @ObfuscatedName("np.n(Lnw;I)V")
    public void method6524(class376 arg0) {
        if (this.field4399 == arg0) {
            return;
        }
        this.field4399 = arg0;
        if (this.field4399 == null) {
            return;
        }
        if (this.field4400 == 0) {
            this.field4400 = this.field4399.field4419;
        }
        if (!this.method6511()) {
            this.method6537(0, this.field4390.size(), false);
        }
    }

    @ObfuscatedName("np.l(II)V")
    public void method6536(int arg0) {
        if (this.field4401 != arg0) {
            this.field4401 = arg0;
            this.method6537(0, this.field4390.size(), false);
        }
    }

    @ObfuscatedName("np.k(IS)V")
    public void method6518(int arg0) {
        if (this.field4400 != arg0) {
            this.field4400 = arg0;
            this.method6537(0, this.field4390.size(), false);
        }
    }

    @ObfuscatedName("np.c(IIB)Lnm;")
    public class377 method6575(int arg0, int arg1) {
        if (arg0 == arg1) {
            return new class377(this, 0, 0);
        } else if (arg0 <= this.field4390.size() && arg1 <= this.field4390.size()) {
            return arg1 < arg0 ? new class377(this, arg1, arg0) : new class377(this, arg0, arg1);
        } else {
            return new class377(this, 0, 0);
        }
    }

    @ObfuscatedName("np.r(CIIII)Lnu;")
    public class374 method6609(char arg0, int arg1, int arg2, int arg3) {
        return this.method6521(Character.toString(arg0), arg1, arg2, arg3);
    }

    @ObfuscatedName("np.b(Ljava/lang/String;IIII)Lnu;")
    public class374 method6521(String arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            arg2 = Integer.MAX_VALUE;
        }
        if (this.field4390.size() >= arg2) {
            return new class374(arg1, true);
        }
        this.field4390.ensureCapacity(this.field4390.size() + arg0.length());
        int var5 = arg1;
        int var6 = 0;
        class375 var7 = this.method6538(arg1);
        int var8 = this.method6525(arg1);
        int var9 = -1;
        while (var6 < arg0.length() && this.field4390.size() < arg2) {
            class375 var10 = new class375();
            var10.field4412 = arg0.charAt(var6++);
            int var11;
            if (var10.field4412 == '\n') {
                var10.field4411 = var7.field4411 + this.method6531();
                var11 = 0;
            } else {
                var10.field4409 = var7.field4409 + var8;
                var10.field4411 = var7.field4411;
                var11 = this.method6541(var10, false);
                if (this.field4397 && var10.field4409 + var11 > this.field4395) {
                    if (this.field4401 == 0) {
                        var10.field4409 = 0;
                        var10.field4411 += this.method6531();
                    } else if (var9 == -1) {
                        var9 = var5;
                    }
                }
            }
            var7 = var10;
            var8 = var11;
            this.field4390.add(var5, var10);
            var5++;
        }
        int var12 = var9 == -1 ? var5 : var9;
        this.method6537(var12, this.field4390.size(), true);
        if (arg3 == 0 || this.method6572() <= arg3) {
            return new class374(var5, false);
        }
        while (arg1 != var5) {
            var5--;
            this.method6587(var5);
            if (this.method6572() <= arg3) {
                break;
            }
        }
        return new class374(var5, true);
    }

    @ObfuscatedName("np.m(Ljava/lang/String;III)Lnu;")
    public class374 method6510(String arg0, int arg1, int arg2) {
        return this.method6521(arg0, this.field4390.size(), arg1, arg2);
    }

    @ObfuscatedName("np.t(Ljava/lang/String;I)Lnu;")
    public class374 method6523(String arg0) {
        this.method6512();
        return this.method6510(arg0, 0, 0);
    }

    @ObfuscatedName("np.h(B)V")
    public void method6512() {
        this.field4390.clear();
    }

    @ObfuscatedName("np.p(II)I")
    public int method6587(int arg0) {
        return this.method6526(arg0, arg0 + 1);
    }

    @ObfuscatedName("np.o(IIS)I")
    public int method6526(int arg0, int arg1) {
        if (arg1 < arg0) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        this.field4390.subList(arg0, arg1).clear();
        int var4 = arg0;
        if (this.field4397 && this.field4401 == 1) {
            label32: {
                int var5 = arg0;
                char var6;
                do {
                    if (var5 <= 0) {
                        break label32;
                    }
                    var5--;
                    var6 = ((class375) this.field4390.get(var5)).field4412;
                } while (var6 != ' ' && var6 != '\t');
                var4 = var5;
            }
        }
        this.method6537(var4, this.field4390.size(), true);
        return arg0;
    }

    @ObfuscatedName("np.u(IIS)I")
    public int method6527(int arg0, int arg1) {
        if (this.field4399 == null || arg0 < 0 || arg1 < 0) {
            return 0;
        } else if (this.field4397 && arg0 > this.field4395) {
            return this.field4390.size();
        } else {
            if (!this.field4390.isEmpty()) {
                for (int var3 = 0; var3 < this.field4390.size(); var3++) {
                    class375 var4 = (class375) this.field4390.get(var3);
                    if (arg1 <= var4.field4411 + this.method6531()) {
                        if (arg1 < var4.field4411) {
                            break;
                        }
                        if (arg0 < var4.field4409) {
                            return var3 > 0 ? var3 - 1 : 0;
                        }
                        if (var3 + 1 != this.field4390.size() && ((class375) this.field4390.get(var3 + 1)).field4411 != var4.field4411) {
                            int var5 = this.method6541((class375) this.field4390.get(var3), false);
                            if (arg0 < var4.field4409 + var5) {
                                return var3;
                            }
                            if (arg1 <= var4.field4411 + this.method6531()) {
                                return var3 + 1;
                            }
                        }
                    }
                }
                class375 var6 = (class375) this.field4390.get(this.field4390.size() - 1);
                if (arg0 >= var6.field4409 && arg0 <= var6.field4409 + this.method6533() && arg1 >= var6.field4411 && arg1 <= var6.field4411 + this.method6531()) {
                    return this.field4390.size() - 1;
                }
            }
            return this.field4390.size();
        }
    }

    @ObfuscatedName("np.x(III)I")
    public int method6550(int arg0, int arg1) {
        if (this.field4399 == null || this.method6511() || arg0 > this.field4390.size()) {
            return 0;
        }
        byte var3;
        if (arg1 > 0) {
            var3 = 1;
        } else {
            var3 = -1;
            arg1 = -arg1;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 > 0) {
            class375 var6 = (class375) this.field4390.get(arg0 - 1);
            var4 = var6.field4409 + this.method6540(arg0 - 1);
            var5 = var6.field4411;
        } else if (var3 == -1 && arg0 == 0) {
            return 0;
        }
        int var7 = 16777215;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 16777215;
        int var11 = var3 == 1 ? this.field4390.size() + 1 : 0;
        for (int var12 = arg0 + var3; var12 != var11; var12 += var3) {
            class375 var13 = (class375) this.field4390.get(var12 - 1);
            if (var13.field4411 != var5) {
                var8++;
                var5 = var13.field4411;
                if (var8 > arg1) {
                    return var9;
                }
            }
            if (arg1 == var8) {
                int var14 = Math.abs(var13.field4409 + this.method6540(var12 - 1) - var4);
                if (var14 >= var10) {
                    return var9;
                }
                var9 = var12;
                var10 = var14;
            }
        }
        if (var3 == 1) {
            return this.field4390.size();
        } else {
            if (var5 != 0) {
                var8++;
            }
            return var10 == 16777215 || arg1 == var8 && var4 < var10 ? 0 : var9;
        }
    }

    @ObfuscatedName("np.a(B)I")
    public int method6610() {
        if (!this.field4390.isEmpty() && this.method6572() == 1) {
            return this.field4390.isEmpty() ? 0 : ((class375) this.field4390.get(this.field4390.size() - 1)).field4409 + this.method6533();
        }
        int var1 = -1;
        int var2 = 0;
        for (int var3 = this.field4390.size() - 1; var3 >= 0; var3--) {
            class375 var4 = (class375) this.field4390.get(var3);
            if (var4.field4411 != var1) {
                int var5 = this.method6541(var4, false) + var4.field4409;
                var2 = Math.max(var5, var2);
                var1 = var4.field4411;
            }
        }
        return var2;
    }

    @ObfuscatedName("np.q(B)I")
    public int method6530() {
        return this.method6511() ? 0 : this.field4399.field4419 + ((class375) this.field4390.get(this.field4390.size() - 1)).field4411;
    }

    @ObfuscatedName("np.d(I)I")
    public int method6531() {
        return this.field4400;
    }

    @ObfuscatedName("np.e(I)I")
    public int method6572() {
        return this.method6530() / this.field4399.field4419;
    }

    @ObfuscatedName("np.g(I)I")
    public int method6533() {
        return this.method6511() ? 0 : this.method6541((class375) this.field4390.get(this.field4390.size() - 1), false);
    }

    @ObfuscatedName("np.y(I)I")
    public int method6534() {
        return this.field4395;
    }

    @ObfuscatedName("np.af(I)I")
    public int method6535() {
        return this.field4401;
    }

    @ObfuscatedName("np.aa(B)I")
    public int method6520() {
        return this.field4402;
    }

    @ObfuscatedName("np.ai(IIZI)V")
    public void method6537(int arg0, int arg1, boolean arg2) {
        if (this.method6511() || this.field4399 == null) {
            return;
        }
        class375 var4 = this.method6538(arg0);
        int var5 = this.method6525(arg0);
        for (int var6 = arg0; var6 < arg1; var6++) {
            class375 var7 = (class375) this.field4390.get(var6);
            if (var7.field4412 == '\n') {
                int var8 = var4.field4411 + this.method6531();
                if (arg2) {
                    if (var7.field4411 != var8) {
                        int var9 = var8 - var7.field4411;
                        for (int var10 = var6; var10 < arg1; var10++) {
                            class375 var10000 = (class375) this.field4390.get(var10);
                            var10000.field4411 += var9;
                        }
                    }
                    break;
                }
                var7.field4411 = var8;
                boolean var11 = false;
            } else {
                var7.field4409 = var4.field4409 + var5;
                var7.field4411 = var4.field4411;
                int var12 = this.method6541(var7, false);
                if (this.field4397 && var7.field4409 + var12 > this.field4395) {
                    boolean var13 = false;
                    if (this.field4401 == 1) {
                        for (int var14 = var6; var14 > 0; var14--) {
                            class375 var15 = (class375) this.field4390.get(var14 - 1);
                            if (var7.field4411 != var15.field4411) {
                                break;
                            }
                            if (var15.field4412 == ' ' || var15.field4412 == '\t') {
                                class375 var16 = (class375) this.field4390.get(var14);
                                int var17 = var16.field4409;
                                int var18 = var16.field4411 + this.method6531();
                                for (int var19 = var14; var19 <= var6; var19++) {
                                    class375 var20 = (class375) this.field4390.get(var19);
                                    var20.field4409 -= var17;
                                    var20.field4411 = var18;
                                }
                                var13 = true;
                                break;
                            }
                        }
                    }
                    if (!var13) {
                        var7.field4409 = 0;
                        var7.field4411 += this.method6531();
                    }
                }
            }
            var4 = (class375) this.field4390.get(var6);
            var5 = this.method6541(var4, false);
        }
    }

    @ObfuscatedName("np.ag(II)Lnq;")
    public class375 method6538(int arg0) {
        if (arg0 <= 0 || this.field4390.isEmpty()) {
            return new class375();
        } else if (arg0 >= this.field4390.size()) {
            return (class375) this.field4390.get(this.field4390.size() - 1);
        } else {
            return (class375) this.field4390.get(arg0 - 1);
        }
    }

    @ObfuscatedName("np.aw(IB)I")
    public int method6525(int arg0) {
        if (arg0 <= 0 || this.field4390.isEmpty()) {
            return 0;
        } else if (arg0 >= this.field4390.size()) {
            return this.method6540(this.field4390.size() - 1);
        } else {
            return this.method6540(arg0 - 1);
        }
    }

    @ObfuscatedName("np.ar(II)I")
    public int method6540(int arg0) {
        return arg0 < this.field4390.size() ? this.method6541((class375) this.field4390.get(arg0), false) : 0;
    }

    @ObfuscatedName("np.al(Lnq;ZI)I")
    public int method6541(class375 arg0, boolean arg1) {
        if (arg0.field4412 == '\n') {
            return 0;
        } else if (arg1 || this.field4402 == 0) {
            int var3 = this.field4399.field4415[arg0.field4412];
            if (var3 == 0) {
                return arg0.field4412 == '\t' ? this.field4399.field4415[32] * 3 : this.field4399.field4415[32];
            } else {
                return var3;
            }
        } else {
            return this.field4399.field4415[42];
        }
    }
}
