package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("ah")
public class class33 {

    @ObfuscatedName("ah.o")
    public int field461 = -1;

    @ObfuscatedName("ah.k")
    public String field450;

    @ObfuscatedName("ah.t")
    public String field463;

    @ObfuscatedName("ah.d")
    public int field455 = -1;

    @ObfuscatedName("ah.h")
    public int field452 = -1;

    @ObfuscatedName("ah.m")
    public class239 field454 = null;

    @ObfuscatedName("ah.z")
    public int field451 = Integer.MAX_VALUE;

    @ObfuscatedName("ah.i")
    public int field456 = 0;

    @ObfuscatedName("ah.u")
    public int field457 = Integer.MAX_VALUE;

    @ObfuscatedName("ah.x")
    public int field458 = 0;

    @ObfuscatedName("ah.y")
    public boolean field459 = false;

    @ObfuscatedName("ah.a")
    public LinkedList field460;

    @ObfuscatedName("ah.o(Lgc;II)V")
    public void method279(class195 arg0, int arg1) {
        this.field461 = arg1;
        this.field450 = arg0.method3284();
        this.field463 = arg0.method3284();
        this.field454 = new class239(arg0.method3254());
        this.field455 = arg0.method3254();
        arg0.method3205();
        this.field459 = arg0.method3205() == 1;
        this.field452 = arg0.method3205();
        int var3 = arg0.method3205();
        this.field460 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field460.add(this.method280(arg0));
        }
        this.method285();
    }

    @ObfuscatedName("ah.k(Lgc;B)Lau;")
    public class44 method280(class195 arg0) {
        int var2 = arg0.method3205();
        class28 var3 = (class28) class190.method4146(class28.method231(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field404) {
            case 0:
                var5 = new class27();
                break;
            case 1:
                var5 = new class40();
                break;
            case 2:
                var5 = new class50();
                break;
            case 3:
                var5 = new class31();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class44) var5).method198(arg0);
        return (class44) var5;
    }

    @ObfuscatedName("ah.t(IIIB)Z")
    public boolean method281(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field460.iterator();
        class44 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class44) var4.next();
        } while (!var5.method194(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("ah.d(III)Z")
    public boolean method297(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field451 || var3 > this.field456) {
            return false;
        } else if (var4 >= this.field457 && var4 <= this.field458) {
            Iterator var5 = this.field460.iterator();
            class44 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class44) var5.next();
            } while (!var6.method195(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ah.h(IIII)[I")
    public int[] method283(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field460.iterator();
        class44 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class44) var4.next();
        } while (!var5.method194(arg0, arg1, arg2));
        return var5.method196(arg0, arg1, arg2);
    }

    @ObfuscatedName("ah.m(IIB)Lix;")
    public class239 method284(int arg0, int arg1) {
        Iterator var3 = this.field460.iterator();
        class44 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class44) var3.next();
        } while (!var4.method195(arg0, arg1));
        return var4.method217(arg0, arg1);
    }

    @ObfuscatedName("ah.z(S)V")
    public void method285() {
        Iterator var1 = this.field460.iterator();
        while (var1.hasNext()) {
            class44 var2 = (class44) var1.next();
            var2.method192(this);
        }
    }

    @ObfuscatedName("ah.i(I)I")
    public int method286() {
        return this.field461;
    }

    @ObfuscatedName("ah.u(I)Z")
    public boolean method287() {
        return this.field459;
    }

    @ObfuscatedName("ah.x(I)Ljava/lang/String;")
    public String method288() {
        return this.field450;
    }

    @ObfuscatedName("ah.y(B)Ljava/lang/String;")
    public String method289() {
        return this.field463;
    }

    @ObfuscatedName("ah.a(I)I")
    public int method314() {
        return this.field455;
    }

    @ObfuscatedName("ah.v(I)I")
    public int method300() {
        return this.field452;
    }

    @ObfuscatedName("ah.q(B)I")
    public int method350() {
        return this.field451;
    }

    @ObfuscatedName("ah.r(I)I")
    public int method322() {
        return this.field456;
    }

    @ObfuscatedName("ah.j(I)I")
    public int method294() {
        return this.field457;
    }

    @ObfuscatedName("ah.b(I)I")
    public int method293() {
        return this.field458;
    }

    @ObfuscatedName("ah.g(B)I")
    public int method296() {
        return this.field454.field2787;
    }

    @ObfuscatedName("ah.f(I)I")
    public int method348() {
        return this.field454.field2784;
    }

    @ObfuscatedName("ah.p(I)I")
    public int method298() {
        return this.field454.field2785;
    }

    @ObfuscatedName("ah.e(I)Lix;")
    public class239 method299() {
        return new class239(this.field454);
    }
}
