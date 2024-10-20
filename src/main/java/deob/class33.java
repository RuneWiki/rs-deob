package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("as")
public class class33 {

    @ObfuscatedName("as.c")
    public int field439 = -1;

    @ObfuscatedName("as.i")
    public String field433;

    @ObfuscatedName("as.o")
    public String field430;

    @ObfuscatedName("as.j")
    public int field431 = -1;

    @ObfuscatedName("as.k")
    public int field440 = -1;

    @ObfuscatedName("as.x")
    public class239 field429 = null;

    @ObfuscatedName("as.z")
    public int field434 = Integer.MAX_VALUE;

    @ObfuscatedName("as.p")
    public int field432 = 0;

    @ObfuscatedName("as.w")
    public int field435 = Integer.MAX_VALUE;

    @ObfuscatedName("as.r")
    public int field437 = 0;

    @ObfuscatedName("as.d")
    public boolean field438 = false;

    @ObfuscatedName("as.a")
    public LinkedList field436;

    @ObfuscatedName("as.c(Lgp;IB)V")
    public void method269(class195 arg0, int arg1) {
        this.field439 = arg1;
        this.field433 = arg0.method3427();
        this.field430 = arg0.method3427();
        this.field429 = new class239(arg0.method3230());
        this.field431 = arg0.method3230();
        arg0.method3429();
        this.field438 = arg0.method3429() == 1;
        this.field440 = arg0.method3429();
        int var3 = arg0.method3429();
        this.field436 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field436.add(this.method270(arg0));
        }
        this.method279();
    }

    @ObfuscatedName("as.i(Lgp;I)Lay;")
    public class44 method270(class195 arg0) {
        int var2 = arg0.method3429();
        class28 var3 = (class28) class190.method578(class28.method225(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field382) {
            case 0:
                var5 = new class31();
                break;
            case 1:
                var5 = new class27();
                break;
            case 2:
                var5 = new class40();
                break;
            case 3:
                var5 = new class50();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class44) var5).method198(arg0);
        return (class44) var5;
    }

    @ObfuscatedName("as.o(IIIB)Z")
    public boolean method271(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field436.iterator();
        class44 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class44) var4.next();
        } while (!var5.method194(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("as.j(IIB)Z")
    public boolean method272(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field434 || var3 > this.field432) {
            return false;
        } else if (var4 >= this.field435 && var4 <= this.field437) {
            Iterator var5 = this.field436.iterator();
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

    @ObfuscatedName("as.k(IIII)[I")
    public int[] method273(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field436.iterator();
        class44 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class44) var4.next();
        } while (!var5.method194(arg0, arg1, arg2));
        return var5.method196(arg0, arg1, arg2);
    }

    @ObfuscatedName("as.x(III)Lim;")
    public class239 method318(int arg0, int arg1) {
        Iterator var3 = this.field436.iterator();
        class44 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class44) var3.next();
        } while (!var4.method195(arg0, arg1));
        return var4.method218(arg0, arg1);
    }

    @ObfuscatedName("as.z(B)V")
    public void method279() {
        Iterator var1 = this.field436.iterator();
        while (var1.hasNext()) {
            class44 var2 = (class44) var1.next();
            var2.method216(this);
        }
    }

    @ObfuscatedName("as.p(I)I")
    public int method285() {
        return this.field439;
    }

    @ObfuscatedName("as.w(I)Z")
    public boolean method338() {
        return this.field438;
    }

    @ObfuscatedName("as.r(B)Ljava/lang/String;")
    public String method319() {
        return this.field433;
    }

    @ObfuscatedName("as.d(B)Ljava/lang/String;")
    public String method284() {
        return this.field430;
    }

    @ObfuscatedName("as.a(I)I")
    public int method280() {
        return this.field431;
    }

    @ObfuscatedName("as.b(I)I")
    public int method316() {
        return this.field440;
    }

    @ObfuscatedName("as.h(B)I")
    public int method282() {
        return this.field434;
    }

    @ObfuscatedName("as.n(I)I")
    public int method283() {
        return this.field432;
    }

    @ObfuscatedName("as.u(I)I")
    public int method337() {
        return this.field435;
    }

    @ObfuscatedName("as.q(I)I")
    public int method277() {
        return this.field437;
    }

    @ObfuscatedName("as.g(B)I")
    public int method286() {
        return this.field429.field2775;
    }

    @ObfuscatedName("as.y(B)I")
    public int method287() {
        return this.field429.field2780;
    }

    @ObfuscatedName("as.s(I)I")
    public int method288() {
        return this.field429.field2777;
    }

    @ObfuscatedName("as.ac(I)Lim;")
    public class239 method321() {
        return new class239(this.field429);
    }
}
