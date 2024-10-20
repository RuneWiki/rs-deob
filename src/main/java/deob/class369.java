package deob;

import java.util.ArrayList;

@ObfuscatedName("nu")
public class class369 {

    @ObfuscatedName("nu.j")
    public int field4379 = Integer.MAX_VALUE;

    @ObfuscatedName("nu.g")
    public int field4383 = 0;

    @ObfuscatedName("nu.i")
    public boolean field4384 = true;

    @ObfuscatedName("nu.o")
    public boolean field4385 = true;

    @ObfuscatedName("nu.n")
    public class372 field4386;

    @ObfuscatedName("nu.k")
    public ArrayList field4387 = new ArrayList();

    @ObfuscatedName("nu.a")
    public int field4388 = 0;

    @ObfuscatedName("nu.s")
    public int field4389 = 0;

    @ObfuscatedName("nu.h(II)Lnp;")
    public class371 method6402(int arg0) {
        return (class371) this.field4387.get(arg0);
    }

    @ObfuscatedName("nu.e(B)Lnp;")
    public class371 method6403() {
        return this.field4387.size() == 0 ? null : (class371) this.field4387.get(this.field4387.size() - 1);
    }

    @ObfuscatedName("nu.v(I)Z")
    public boolean method6467() {
        return this.field4387.size() == 0;
    }

    @ObfuscatedName("nu.x(I)I")
    public int method6405() {
        return this.field4387.size();
    }

    @ObfuscatedName("nu.m(B)Ljava/lang/String;")
    public String method6455() {
        if (this.method6467()) {
            return "";
        }
        StringBuilder var1 = new StringBuilder(this.method6405());
        for (int var2 = 0; var2 < this.method6405(); var2++) {
            class371 var3 = this.method6402(var2);
            var1.append(var3.field4396);
        }
        return var1.toString();
    }

    @ObfuscatedName("nu.q(IZI)V")
    public void method6406(int arg0, boolean arg1) {
        if (this.field4386 != null && arg0 < this.field4386.field4408 * 2) {
            arg0 = Integer.MAX_VALUE;
        }
        if (this.field4379 != arg0 || this.field4384 != arg1) {
            this.field4379 = arg0;
            this.field4384 = arg1;
            this.method6404(0, this.field4387.size(), false);
        }
    }

    @ObfuscatedName("nu.f(IB)V")
    public void method6407(int arg0) {
        if (this.field4389 != arg0) {
            this.field4389 = arg0;
            this.method6404(0, this.field4387.size(), false);
        }
    }

    @ObfuscatedName("nu.r(Lne;I)V")
    public void method6472(class372 arg0) {
        if (this.field4386 == arg0) {
            return;
        }
        this.field4386 = arg0;
        if (this.field4386 == null) {
            return;
        }
        if (this.field4383 == 0) {
            this.field4383 = this.field4386.field4408;
        }
        if (!this.method6467()) {
            this.method6404(0, this.field4387.size(), false);
        }
    }

    @ObfuscatedName("nu.u(IS)V")
    public void method6487(int arg0) {
        if (this.field4388 != arg0) {
            this.field4388 = arg0;
            this.method6404(0, this.field4387.size(), false);
        }
    }

    @ObfuscatedName("nu.b(II)V")
    public void method6481(int arg0) {
        if (this.field4383 != arg0) {
            this.field4383 = arg0;
            this.method6404(0, this.field4387.size(), false);
        }
    }

    @ObfuscatedName("nu.j(IIB)Lna;")
    public class373 method6456(int arg0, int arg1) {
        if (arg0 == arg1) {
            return new class373(this, 0, 0);
        } else if (arg0 <= this.field4387.size() && arg1 <= this.field4387.size()) {
            return arg1 < arg0 ? new class373(this, arg1, arg0) : new class373(this, arg0, arg1);
        } else {
            return new class373(this, 0, 0);
        }
    }

    @ObfuscatedName("nu.g(CIIII)Lny;")
    public class370 method6412(char arg0, int arg1, int arg2, int arg3) {
        return this.method6413(Character.toString(arg0), arg1, arg2, arg3);
    }

    @ObfuscatedName("nu.i(Ljava/lang/String;IIII)Lny;")
    public class370 method6413(String arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            arg2 = Integer.MAX_VALUE;
        }
        if (this.field4387.size() >= arg2) {
            return new class370(arg1, true);
        }
        this.field4387.ensureCapacity(this.field4387.size() + arg0.length());
        int var5 = arg1;
        int var6 = 0;
        class371 var7 = this.method6430(arg1);
        int var8 = this.method6431(arg1);
        int var9 = -1;
        while (var6 < arg0.length() && this.field4387.size() < arg2) {
            class371 var10 = new class371();
            var10.field4396 = arg0.charAt(var6++);
            int var11;
            if (var10.field4396 == '\n') {
                var10.field4398 = var7.field4398 + this.method6495();
                var11 = 0;
            } else {
                var10.field4399 = var7.field4399 + var8;
                var10.field4398 = var7.field4398;
                var11 = this.method6433(var10, false);
                if (this.field4384 && var10.field4399 + var11 > this.field4379) {
                    if (this.field4388 == 0) {
                        var10.field4399 = 0;
                        var10.field4398 += this.method6495();
                    } else if (var9 == -1) {
                        var9 = var5;
                    }
                }
            }
            var7 = var10;
            var8 = var11;
            this.field4387.add(var5, var10);
            var5++;
        }
        int var12 = var9 == -1 ? var5 : var9;
        this.method6404(var12, this.field4387.size(), true);
        if (arg3 == 0 || this.method6497() <= arg3) {
            return new class370(var5, false);
        }
        while (arg1 != var5) {
            var5--;
            this.method6417(var5);
            if (this.method6497() <= arg3) {
                break;
            }
        }
        return new class370(var5, true);
    }

    @ObfuscatedName("nu.o(Ljava/lang/String;III)Lny;")
    public class370 method6414(String arg0, int arg1, int arg2) {
        return this.method6413(arg0, this.field4387.size(), arg1, arg2);
    }

    @ObfuscatedName("nu.n(Ljava/lang/String;B)Lny;")
    public class370 method6415(String arg0) {
        this.method6416();
        return this.method6414(arg0, 0, 0);
    }

    @ObfuscatedName("nu.k(B)V")
    public void method6416() {
        this.field4387.clear();
    }

    @ObfuscatedName("nu.a(II)I")
    public int method6417(int arg0) {
        return this.method6410(arg0, arg0 + 1);
    }

    @ObfuscatedName("nu.s(III)I")
    public int method6410(int arg0, int arg1) {
        if (arg1 < arg0) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        this.field4387.subList(arg0, arg1).clear();
        int var4 = arg0;
        if (this.field4384 && this.field4388 == 1) {
            label32: {
                int var5 = arg0;
                char var6;
                do {
                    if (var5 <= 0) {
                        break label32;
                    }
                    var5--;
                    var6 = ((class371) this.field4387.get(var5)).field4396;
                } while (var6 != ' ' && var6 != '\t');
                var4 = var5;
            }
        }
        this.method6404(var4, this.field4387.size(), true);
        return arg0;
    }

    @ObfuscatedName("nu.l(III)I")
    public int method6419(int arg0, int arg1) {
        if (this.field4386 == null || arg0 < 0 || arg1 < 0) {
            return 0;
        } else if (this.field4384 && arg0 > this.field4379) {
            return this.field4387.size();
        } else {
            if (!this.field4387.isEmpty()) {
                for (int var3 = 0; var3 < this.field4387.size(); var3++) {
                    class371 var4 = (class371) this.field4387.get(var3);
                    if (arg1 <= var4.field4398 + this.method6495()) {
                        if (arg1 < var4.field4398) {
                            break;
                        }
                        if (arg0 < var4.field4399) {
                            return var3 > 0 ? var3 - 1 : 0;
                        }
                        if (var3 + 1 != this.field4387.size() && ((class371) this.field4387.get(var3 + 1)).field4398 != var4.field4398) {
                            int var5 = this.method6433((class371) this.field4387.get(var3), false);
                            if (arg0 < var4.field4399 + var5) {
                                return var3;
                            }
                            if (arg1 <= var4.field4398 + this.method6495()) {
                                return var3 + 1;
                            }
                        }
                    }
                }
                class371 var6 = (class371) this.field4387.get(this.field4387.size() - 1);
                if (arg0 >= var6.field4399 && arg0 <= var6.field4399 + this.method6425() && arg1 >= var6.field4398 && arg1 <= var6.field4398 + this.method6495()) {
                    return this.field4387.size() - 1;
                }
            }
            return this.field4387.size();
        }
    }

    @ObfuscatedName("nu.t(III)I")
    public int method6420(int arg0, int arg1) {
        if (this.field4386 == null || this.method6467() || arg0 > this.field4387.size()) {
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
            class371 var6 = (class371) this.field4387.get(arg0 - 1);
            var4 = var6.field4399 + this.method6429(arg0 - 1);
            var5 = var6.field4398;
        } else if (var3 == -1 && arg0 == 0) {
            return 0;
        }
        int var7 = 16777215;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 16777215;
        int var11 = var3 == 1 ? this.field4387.size() + 1 : 0;
        for (int var12 = arg0 + var3; var12 != var11; var12 += var3) {
            class371 var13 = (class371) this.field4387.get(var12 - 1);
            if (var13.field4398 != var5) {
                var8++;
                var5 = var13.field4398;
                if (var8 > arg1) {
                    return var9;
                }
            }
            if (arg1 == var8) {
                int var14 = Math.abs(var13.field4399 + this.method6429(var12 - 1) - var4);
                if (var14 >= var10) {
                    return var9;
                }
                var9 = var12;
                var10 = var14;
            }
        }
        if (var3 == 1) {
            return this.field4387.size();
        } else {
            if (var5 != 0) {
                var8++;
            }
            return var10 == 16777215 || arg1 == var8 && var4 < var10 ? 0 : var9;
        }
    }

    @ObfuscatedName("nu.c(I)I")
    public int method6421() {
        if (!this.field4387.isEmpty() && this.method6497() == 1) {
            return this.field4387.isEmpty() ? 0 : ((class371) this.field4387.get(this.field4387.size() - 1)).field4399 + this.method6425();
        }
        int var1 = -1;
        int var2 = 0;
        for (int var3 = this.field4387.size() - 1; var3 >= 0; var3--) {
            class371 var4 = (class371) this.field4387.get(var3);
            if (var4.field4398 != var1) {
                int var5 = this.method6433(var4, false) + var4.field4399;
                var2 = Math.max(var5, var2);
                var1 = var4.field4398;
            }
        }
        return var2;
    }

    @ObfuscatedName("nu.p(S)I")
    public int method6504() {
        return this.method6467() ? 0 : this.field4386.field4408 + ((class371) this.field4387.get(this.field4387.size() - 1)).field4398;
    }

    @ObfuscatedName("nu.d(I)I")
    public int method6495() {
        return this.field4383;
    }

    @ObfuscatedName("nu.y(I)I")
    public int method6497() {
        return this.method6504() / this.field4386.field4408;
    }

    @ObfuscatedName("nu.z(I)I")
    public int method6425() {
        return this.method6467() ? 0 : this.method6433((class371) this.field4387.get(this.field4387.size() - 1), false);
    }

    @ObfuscatedName("nu.w(I)I")
    public int method6426() {
        return this.field4379;
    }

    @ObfuscatedName("nu.as(I)I")
    public int method6427() {
        return this.field4388;
    }

    @ObfuscatedName("nu.ad(I)I")
    public int method6468() {
        return this.field4389;
    }

    @ObfuscatedName("nu.ao(IIZI)V")
    public void method6404(int arg0, int arg1, boolean arg2) {
        if (this.method6467() || this.field4386 == null) {
            return;
        }
        class371 var4 = this.method6430(arg0);
        int var5 = this.method6431(arg0);
        for (int var6 = arg0; var6 < arg1; var6++) {
            class371 var7 = (class371) this.field4387.get(var6);
            if (var7.field4396 == '\n') {
                int var8 = var4.field4398 + this.method6495();
                if (arg2) {
                    if (var7.field4398 != var8) {
                        int var9 = var8 - var7.field4398;
                        for (int var10 = var6; var10 < arg1; var10++) {
                            class371 var10000 = (class371) this.field4387.get(var10);
                            var10000.field4398 += var9;
                        }
                    }
                    break;
                }
                var7.field4398 = var8;
                boolean var11 = false;
            } else {
                var7.field4399 = var4.field4399 + var5;
                var7.field4398 = var4.field4398;
                int var12 = this.method6433(var7, false);
                if (this.field4384 && var7.field4399 + var12 > this.field4379) {
                    boolean var13 = false;
                    if (this.field4388 == 1) {
                        for (int var14 = var6; var14 > 0; var14--) {
                            class371 var15 = (class371) this.field4387.get(var14 - 1);
                            if (var7.field4398 != var15.field4398) {
                                break;
                            }
                            if (var15.field4396 == ' ' || var15.field4396 == '\t') {
                                class371 var16 = (class371) this.field4387.get(var14);
                                int var17 = var16.field4399;
                                int var18 = var16.field4398 + this.method6495();
                                for (int var19 = var14; var19 <= var6; var19++) {
                                    class371 var20 = (class371) this.field4387.get(var19);
                                    var20.field4399 -= var17;
                                    var20.field4398 = var18;
                                }
                                var13 = true;
                                break;
                            }
                        }
                    }
                    if (!var13) {
                        var7.field4399 = 0;
                        var7.field4398 += this.method6495();
                    }
                }
            }
            var4 = (class371) this.field4387.get(var6);
            var5 = this.method6433(var4, false);
        }
    }

    @ObfuscatedName("nu.am(II)Lnp;")
    public class371 method6430(int arg0) {
        if (arg0 <= 0 || this.field4387.isEmpty()) {
            return new class371();
        } else if (arg0 >= this.field4387.size()) {
            return (class371) this.field4387.get(this.field4387.size() - 1);
        } else {
            return (class371) this.field4387.get(arg0 - 1);
        }
    }

    @ObfuscatedName("nu.av(II)I")
    public int method6431(int arg0) {
        if (arg0 <= 0 || this.field4387.isEmpty()) {
            return 0;
        } else if (arg0 >= this.field4387.size()) {
            return this.method6429(this.field4387.size() - 1);
        } else {
            return this.method6429(arg0 - 1);
        }
    }

    @ObfuscatedName("nu.au(II)I")
    public int method6429(int arg0) {
        return arg0 < this.field4387.size() ? this.method6433((class371) this.field4387.get(arg0), false) : 0;
    }

    @ObfuscatedName("nu.ar(Lnp;ZB)I")
    public int method6433(class371 arg0, boolean arg1) {
        if (arg0.field4396 == '\n') {
            return 0;
        } else if (arg1 || this.field4389 == 0) {
            int var3 = this.field4386.field4416[arg0.field4396];
            if (var3 == 0) {
                return arg0.field4396 == '\t' ? this.field4386.field4416[32] * 3 : this.field4386.field4416[32];
            } else {
                return var3;
            }
        } else {
            return this.field4386.field4416[42];
        }
    }
}
