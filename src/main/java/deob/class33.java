package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("as")
public class class33 {

    @ObfuscatedName("as.g")
    public int field454 = -1;

    @ObfuscatedName("as.e")
    public String field444;

    @ObfuscatedName("as.b")
    public String field448;

    @ObfuscatedName("as.z")
    public int field445 = -1;

    @ObfuscatedName("as.n")
    public int field446 = -1;

    @ObfuscatedName("as.l")
    public class239 field447 = null;

    @ObfuscatedName("as.s")
    public int field450 = Integer.MAX_VALUE;

    @ObfuscatedName("as.y")
    public int field449 = 0;

    @ObfuscatedName("as.c")
    public int field443 = Integer.MAX_VALUE;

    @ObfuscatedName("as.h")
    public int field451 = 0;

    @ObfuscatedName("as.i")
    public boolean field442 = false;

    @ObfuscatedName("as.o")
    public LinkedList field453;

    @ObfuscatedName("as.g(Lgg;II)V")
    public void method245(class195 arg0, int arg1) {
        this.field454 = arg1;
        this.field444 = arg0.method3429();
        this.field448 = arg0.method3429();
        this.field447 = new class239(arg0.method3472());
        this.field445 = arg0.method3472();
        arg0.method3332();
        this.field442 = arg0.method3332() == 1;
        this.field446 = arg0.method3332();
        int var3 = arg0.method3332();
        this.field453 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field453.add(this.method246(arg0));
        }
        this.method251();
    }

    @ObfuscatedName("as.e(Lgg;I)Lau;")
    public class44 method246(class195 arg0) {
        int var2 = arg0.method3332();
        class28 var3 = (class28) Statics.method3233(class28.method205(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field396) {
            case 0:
                var5 = new class31();
                break;
            case 1:
                var5 = new class40();
                break;
            case 2:
                var5 = new class50();
                break;
            case 3:
                var5 = new class27();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class44) var5).method188(arg0);
        return (class44) var5;
    }

    @ObfuscatedName("as.b(IIII)Z")
    public boolean method247(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field453.iterator();
        class44 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class44) var4.next();
        } while (!var5.method185(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("as.z(IIB)Z")
    public boolean method248(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field450 || var3 > this.field449) {
            return false;
        } else if (var4 >= this.field443 && var4 <= this.field451) {
            Iterator var5 = this.field453.iterator();
            class44 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class44) var5.next();
            } while (!var6.method204(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("as.n(IIII)[I")
    public int[] method319(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field453.iterator();
        class44 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class44) var4.next();
        } while (!var5.method185(arg0, arg1, arg2));
        return var5.method186(arg0, arg1, arg2);
    }

    @ObfuscatedName("as.l(IIB)Lio;")
    public class239 method250(int arg0, int arg1) {
        Iterator var3 = this.field453.iterator();
        class44 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class44) var3.next();
        } while (!var4.method204(arg0, arg1));
        return var4.method182(arg0, arg1);
    }

    @ObfuscatedName("as.s(B)V")
    public void method251() {
        Iterator var1 = this.field453.iterator();
        while (var1.hasNext()) {
            class44 var2 = (class44) var1.next();
            var2.method183(this);
        }
    }

    @ObfuscatedName("as.y(I)I")
    public int method252() {
        return this.field454;
    }

    @ObfuscatedName("as.c(I)Z")
    public boolean method323() {
        return this.field442;
    }

    @ObfuscatedName("as.o(S)Ljava/lang/String;")
    public String method254() {
        return this.field444;
    }

    @ObfuscatedName("as.d(I)Ljava/lang/String;")
    public String method255() {
        return this.field448;
    }

    @ObfuscatedName("as.r(I)I")
    public int method281() {
        return this.field445;
    }

    @ObfuscatedName("as.p(I)I")
    public int method283() {
        return this.field446;
    }

    @ObfuscatedName("as.q(I)I")
    public int method258() {
        return this.field450;
    }

    @ObfuscatedName("as.f(I)I")
    public int method259() {
        return this.field449;
    }

    @ObfuscatedName("as.j(I)I")
    public int method260() {
        return this.field443;
    }

    @ObfuscatedName("as.v(I)I")
    public int method261() {
        return this.field451;
    }

    @ObfuscatedName("as.u(B)I")
    public int method262() {
        return this.field447.field2791;
    }

    @ObfuscatedName("as.k(I)I")
    public int method263() {
        return this.field447.field2793;
    }

    @ObfuscatedName("as.w(I)I")
    public int method264() {
        return this.field447.field2790;
    }

    @ObfuscatedName("as.x(B)Lio;")
    public class239 method265() {
        return new class239(this.field447);
    }
}
