package deob;

import java.util.ArrayList;

@ObfuscatedName("nz")
public class class366 {

    @ObfuscatedName("nz.l")
    public int field4330 = Integer.MAX_VALUE;

    @ObfuscatedName("nz.s")
    public int field4333 = 0;

    @ObfuscatedName("nz.p")
    public boolean field4334 = true;

    @ObfuscatedName("nz.b")
    public boolean field4331 = true;

    @ObfuscatedName("nz.o")
    public class369 field4336;

    @ObfuscatedName("nz.u")
    public ArrayList field4337 = new ArrayList();

    @ObfuscatedName("nz.z")
    public int field4338 = 0;

    @ObfuscatedName("nz.t")
    public int field4339 = 0;

    @ObfuscatedName("nz.a(II)Lns;")
    public class368 method6301(int arg0) {
        return (class368) this.field4337.get(arg0);
    }

    @ObfuscatedName("nz.f(I)Lns;")
    public class368 method6302() {
        return this.field4337.size() == 0 ? null : (class368) this.field4337.get(this.field4337.size() - 1);
    }

    @ObfuscatedName("nz.c(B)Z")
    public boolean method6303() {
        return this.field4337.size() == 0;
    }

    @ObfuscatedName("nz.x(I)I")
    public int method6363() {
        return this.field4337.size();
    }

    @ObfuscatedName("nz.h(B)Ljava/lang/String;")
    public String method6300() {
        if (this.method6303()) {
            return "";
        }
        StringBuilder var1 = new StringBuilder(this.method6363());
        for (int var2 = 0; var2 < this.method6363(); var2++) {
            class368 var3 = this.method6301(var2);
            var1.append(var3.field4348);
        }
        return var1.toString();
    }

    @ObfuscatedName("nz.j(IZI)V")
    public void method6306(int arg0, boolean arg1) {
        if (this.field4336 != null && arg0 < this.field4336.field4355 * 2) {
            arg0 = Integer.MAX_VALUE;
        }
        if (this.field4330 != arg0 || this.field4334 != arg1) {
            this.field4330 = arg0;
            this.field4334 = arg1;
            this.method6382(0, this.field4337.size(), false);
        }
    }

    @ObfuscatedName("nz.y(IB)V")
    public void method6307(int arg0) {
        if (this.field4339 != arg0) {
            this.field4339 = arg0;
            this.method6382(0, this.field4337.size(), false);
        }
    }

    @ObfuscatedName("nz.d(Lnt;I)V")
    public void method6308(class369 arg0) {
        if (this.field4336 == arg0) {
            return;
        }
        this.field4336 = arg0;
        if (this.field4336 == null) {
            return;
        }
        if (this.field4333 == 0) {
            this.field4333 = this.field4336.field4355;
        }
        if (!this.method6303()) {
            this.method6382(0, this.field4337.size(), false);
        }
    }

    @ObfuscatedName("nz.n(II)V")
    public void method6325(int arg0) {
        if (this.field4338 != arg0) {
            this.field4338 = arg0;
            this.method6382(0, this.field4337.size(), false);
        }
    }

    @ObfuscatedName("nz.r(II)V")
    public void method6310(int arg0) {
        if (this.field4333 != arg0) {
            this.field4333 = arg0;
            this.method6382(0, this.field4337.size(), false);
        }
    }

    @ObfuscatedName("nz.l(III)Lnx;")
    public class370 method6311(int arg0, int arg1) {
        if (arg0 == arg1) {
            return new class370(this, 0, 0);
        } else if (arg0 <= this.field4337.size() && arg1 <= this.field4337.size()) {
            return arg1 < arg0 ? new class370(this, arg1, arg0) : new class370(this, arg0, arg1);
        } else {
            return new class370(this, 0, 0);
        }
    }

    @ObfuscatedName("nz.s(CIIII)Lnu;")
    public class367 method6305(char arg0, int arg1, int arg2, int arg3) {
        return this.method6355(Character.toString(arg0), arg1, arg2, arg3);
    }

    @ObfuscatedName("nz.p(Ljava/lang/String;IIII)Lnu;")
    public class367 method6355(String arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            arg2 = Integer.MAX_VALUE;
        }
        if (this.field4337.size() >= arg2) {
            return new class367(arg1, true);
        }
        this.field4337.ensureCapacity(this.field4337.size() + arg0.length());
        int var5 = arg1;
        int var6 = 0;
        class368 var7 = this.method6392(arg1);
        int var8 = this.method6376(arg1);
        int var9 = -1;
        while (var6 < arg0.length() && this.field4337.size() < arg2) {
            class368 var10 = new class368();
            var10.field4348 = arg0.charAt(var6++);
            int var11;
            if (var10.field4348 == '\n') {
                var10.field4344 = var7.field4344 + this.method6323();
                var11 = 0;
            } else {
                var10.field4342 = var7.field4342 + var8;
                var10.field4344 = var7.field4344;
                var11 = this.method6333(var10, false);
                if (this.field4334 && var10.field4342 + var11 > this.field4330) {
                    if (this.field4338 == 0) {
                        var10.field4342 = 0;
                        var10.field4344 += this.method6323();
                    } else if (var9 == -1) {
                        var9 = var5;
                    }
                }
            }
            var7 = var10;
            var8 = var11;
            this.field4337.add(var5, var10);
            var5++;
        }
        int var12 = var9 == -1 ? var5 : var9;
        this.method6382(var12, this.field4337.size(), true);
        if (arg3 == 0 || this.method6324() <= arg3) {
            return new class367(var5, false);
        }
        while (arg1 != var5) {
            var5--;
            this.method6317(var5);
            if (this.method6324() <= arg3) {
                break;
            }
        }
        return new class367(var5, true);
    }

    @ObfuscatedName("nz.b(Ljava/lang/String;IIB)Lnu;")
    public class367 method6314(String arg0, int arg1, int arg2) {
        return this.method6355(arg0, this.field4337.size(), arg1, arg2);
    }

    @ObfuscatedName("nz.o(Ljava/lang/String;I)Lnu;")
    public class367 method6315(String arg0) {
        this.method6388();
        return this.method6314(arg0, 0, 0);
    }

    @ObfuscatedName("nz.u(I)V")
    public void method6388() {
        this.field4337.clear();
    }

    @ObfuscatedName("nz.z(IB)I")
    public int method6317(int arg0) {
        return this.method6318(arg0, arg0 + 1);
    }

    @ObfuscatedName("nz.t(III)I")
    public int method6318(int arg0, int arg1) {
        if (arg1 < arg0) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        this.field4337.subList(arg0, arg1).clear();
        int var4 = arg0;
        if (this.field4334 && this.field4338 == 1) {
            label32: {
                int var5 = arg0;
                char var6;
                do {
                    if (var5 <= 0) {
                        break label32;
                    }
                    var5--;
                    var6 = ((class368) this.field4337.get(var5)).field4348;
                } while (var6 != ' ' && var6 != '\t');
                var4 = var5;
            }
        }
        this.method6382(var4, this.field4337.size(), true);
        return arg0;
    }

    @ObfuscatedName("nz.w(III)I")
    public int method6350(int arg0, int arg1) {
        if (this.field4336 == null || arg0 < 0 || arg1 < 0) {
            return 0;
        } else if (this.field4334 && arg0 > this.field4330) {
            return this.field4337.size();
        } else {
            if (!this.field4337.isEmpty()) {
                for (int var3 = 0; var3 < this.field4337.size(); var3++) {
                    class368 var4 = (class368) this.field4337.get(var3);
                    if (arg1 <= var4.field4344 + this.method6323()) {
                        if (arg1 < var4.field4344) {
                            break;
                        }
                        if (arg0 < var4.field4342) {
                            return var3 > 0 ? var3 - 1 : 0;
                        }
                        if (var3 + 1 != this.field4337.size() && ((class368) this.field4337.get(var3 + 1)).field4344 != var4.field4344) {
                            int var5 = this.method6333((class368) this.field4337.get(var3), false);
                            if (arg0 < var4.field4342 + var5) {
                                return var3;
                            }
                            if (arg1 <= var4.field4344 + this.method6323()) {
                                return var3 + 1;
                            }
                        }
                    }
                }
                class368 var6 = (class368) this.field4337.get(this.field4337.size() - 1);
                if (arg0 >= var6.field4342 && arg0 <= var6.field4342 + this.method6398() && arg1 >= var6.field4344 && arg1 <= var6.field4344 + this.method6323()) {
                    return this.field4337.size() - 1;
                }
            }
            return this.field4337.size();
        }
    }

    @ObfuscatedName("nz.m(IIB)I")
    public int method6320(int arg0, int arg1) {
        if (this.field4336 == null || this.method6303() || arg0 > this.field4337.size()) {
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
            class368 var6 = (class368) this.field4337.get(arg0 - 1);
            var4 = var6.field4342 + this.method6332(arg0 - 1);
            var5 = var6.field4344;
        } else if (var3 == -1 && arg0 == 0) {
            return 0;
        }
        int var7 = 16777215;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 16777215;
        int var11 = var3 == 1 ? this.field4337.size() + 1 : 0;
        for (int var12 = arg0 + var3; var12 != var11; var12 += var3) {
            class368 var13 = (class368) this.field4337.get(var12 - 1);
            if (var13.field4344 != var5) {
                var8++;
                var5 = var13.field4344;
                if (var8 > arg1) {
                    return var9;
                }
            }
            if (arg1 == var8) {
                int var14 = Math.abs(var13.field4342 + this.method6332(var12 - 1) - var4);
                if (var14 >= var10) {
                    return var9;
                }
                var9 = var12;
                var10 = var14;
            }
        }
        if (var3 == 1) {
            return this.field4337.size();
        } else {
            if (var5 != 0) {
                var8++;
            }
            return var10 == 16777215 || arg1 == var8 && var4 < var10 ? 0 : var9;
        }
    }

    @ObfuscatedName("nz.q(I)I")
    public int method6321() {
        if (!this.field4337.isEmpty() && this.method6324() == 1) {
            return this.field4337.isEmpty() ? 0 : ((class368) this.field4337.get(this.field4337.size() - 1)).field4342 + this.method6398();
        }
        int var1 = -1;
        int var2 = 0;
        for (int var3 = this.field4337.size() - 1; var3 >= 0; var3--) {
            class368 var4 = (class368) this.field4337.get(var3);
            if (var4.field4344 != var1) {
                int var5 = this.method6333(var4, false) + var4.field4342;
                var2 = Math.max(var5, var2);
                var1 = var4.field4344;
            }
        }
        return var2;
    }

    @ObfuscatedName("nz.i(I)I")
    public int method6389() {
        return this.method6303() ? 0 : this.field4336.field4355 + ((class368) this.field4337.get(this.field4337.size() - 1)).field4344;
    }

    @ObfuscatedName("nz.e(I)I")
    public int method6323() {
        return this.field4333;
    }

    @ObfuscatedName("nz.g(I)I")
    public int method6324() {
        return this.method6389() / this.field4336.field4355;
    }

    @ObfuscatedName("nz.k(S)I")
    public int method6398() {
        return this.method6303() ? 0 : this.method6333((class368) this.field4337.get(this.field4337.size() - 1), false);
    }

    @ObfuscatedName("nz.v(I)I")
    public int method6326() {
        return this.field4330;
    }

    @ObfuscatedName("nz.aj(I)I")
    public int method6313() {
        return this.field4338;
    }

    @ObfuscatedName("nz.an(B)I")
    public int method6328() {
        return this.field4339;
    }

    @ObfuscatedName("nz.ah(IIZB)V")
    public void method6382(int arg0, int arg1, boolean arg2) {
        if (this.method6303() || this.field4336 == null) {
            return;
        }
        class368 var4 = this.method6392(arg0);
        int var5 = this.method6376(arg0);
        for (int var6 = arg0; var6 < arg1; var6++) {
            class368 var7 = (class368) this.field4337.get(var6);
            if (var7.field4348 == '\n') {
                int var8 = var4.field4344 + this.method6323();
                if (arg2) {
                    if (var7.field4344 != var8) {
                        int var9 = var8 - var7.field4344;
                        for (int var10 = var6; var10 < arg1; var10++) {
                            class368 var10000 = (class368) this.field4337.get(var10);
                            var10000.field4344 += var9;
                        }
                    }
                    break;
                }
                var7.field4344 = var8;
                boolean var11 = false;
            } else {
                var7.field4342 = var4.field4342 + var5;
                var7.field4344 = var4.field4344;
                int var12 = this.method6333(var7, false);
                if (this.field4334 && var7.field4342 + var12 > this.field4330) {
                    boolean var13 = false;
                    if (this.field4338 == 1) {
                        for (int var14 = var6; var14 > 0; var14--) {
                            class368 var15 = (class368) this.field4337.get(var14 - 1);
                            if (var7.field4344 != var15.field4344) {
                                break;
                            }
                            if (var15.field4348 == ' ' || var15.field4348 == '\t') {
                                class368 var16 = (class368) this.field4337.get(var14);
                                int var17 = var16.field4342;
                                int var18 = var16.field4344 + this.method6323();
                                for (int var19 = var14; var19 <= var6; var19++) {
                                    class368 var20 = (class368) this.field4337.get(var19);
                                    var20.field4342 -= var17;
                                    var20.field4344 = var18;
                                }
                                var13 = true;
                                break;
                            }
                        }
                    }
                    if (!var13) {
                        var7.field4342 = 0;
                        var7.field4344 += this.method6323();
                    }
                }
            }
            var4 = (class368) this.field4337.get(var6);
            var5 = this.method6333(var4, false);
        }
    }

    @ObfuscatedName("nz.ao(II)Lns;")
    public class368 method6392(int arg0) {
        if (arg0 <= 0 || this.field4337.isEmpty()) {
            return new class368();
        } else if (arg0 >= this.field4337.size()) {
            return (class368) this.field4337.get(this.field4337.size() - 1);
        } else {
            return (class368) this.field4337.get(arg0 - 1);
        }
    }

    @ObfuscatedName("nz.ac(II)I")
    public int method6376(int arg0) {
        if (arg0 <= 0 || this.field4337.isEmpty()) {
            return 0;
        } else if (arg0 >= this.field4337.size()) {
            return this.method6332(this.field4337.size() - 1);
        } else {
            return this.method6332(arg0 - 1);
        }
    }

    @ObfuscatedName("nz.af(IB)I")
    public int method6332(int arg0) {
        return arg0 < this.field4337.size() ? this.method6333((class368) this.field4337.get(arg0), false) : 0;
    }

    @ObfuscatedName("nz.ad(Lns;ZI)I")
    public int method6333(class368 arg0, boolean arg1) {
        if (arg0.field4348 == '\n') {
            return 0;
        } else if (arg1 || this.field4339 == 0) {
            int var3 = this.field4336.field4350[arg0.field4348];
            if (var3 == 0) {
                return arg0.field4348 == '\t' ? this.field4336.field4350[32] * 3 : this.field4336.field4350[32];
            } else {
                return var3;
            }
        } else {
            return this.field4336.field4350[42];
        }
    }
}
