package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("al")
public class class33 {

    @ObfuscatedName("al.p")
    public int field468 = -1;

    @ObfuscatedName("al.m")
    public String field463;

    @ObfuscatedName("al.e")
    public String field461;

    @ObfuscatedName("al.t")
    public int field462 = -1;

    @ObfuscatedName("al.w")
    public int field473 = -1;

    @ObfuscatedName("al.z")
    public class213 field464 = null;

    @ObfuscatedName("al.j")
    public int field460 = Integer.MAX_VALUE;

    @ObfuscatedName("al.i")
    public int field466 = 0;

    @ObfuscatedName("al.f")
    public int field467 = Integer.MAX_VALUE;

    @ObfuscatedName("al.c")
    public int field459 = 0;

    @ObfuscatedName("al.o")
    public boolean field469 = false;

    @ObfuscatedName("al.q")
    public LinkedList field470;

    @ObfuscatedName("al.p(Lfr;II)V")
    public void method253(class174 arg0, int arg1) {
        this.field468 = arg1;
        this.field463 = arg0.method2818();
        this.field461 = arg0.method2818();
        this.field464 = new class213(arg0.method2803());
        this.field462 = arg0.method2803();
        arg0.method2810();
        this.field469 = arg0.method2810() == 1;
        this.field473 = arg0.method2810();
        int var3 = arg0.method2810();
        this.field470 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field470.add(this.method320(arg0));
        }
        this.method263();
    }

    @ObfuscatedName("al.m(Lfr;I)Laq;")
    public class43 method320(class174 arg0) {
        int var2 = arg0.method2810();
        class28[] var3 = new class28[] { class28.field412, class28.field410, class28.field411, class28.field409 };
        class28 var4 = (class28) Statics.method666(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field418) {
            case 0:
                var6 = new class39();
                break;
            case 1:
                var6 = new class31();
                break;
            case 2:
                var6 = new class27();
                break;
            case 3:
                var6 = new class49();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class43) var6).method201(arg0);
        return (class43) var6;
    }

    @ObfuscatedName("al.e(IIIB)Z")
    public boolean method255(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field470.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class43) var4.next();
        } while (!var5.method197(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("al.t(III)Z")
    public boolean method256(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field460 || var3 > this.field466) {
            return false;
        } else if (var4 >= this.field467 && var4 <= this.field459) {
            Iterator var5 = this.field470.iterator();
            class43 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class43) var5.next();
            } while (!var6.method198(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("al.w(IIII)[I")
    public int[] method319(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field470.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class43) var4.next();
        } while (!var5.method197(arg0, arg1, arg2));
        return var5.method208(arg0, arg1, arg2);
    }

    @ObfuscatedName("al.z(IIB)Lhg;")
    public class213 method290(int arg0, int arg1) {
        Iterator var3 = this.field470.iterator();
        class43 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class43) var3.next();
        } while (!var4.method198(arg0, arg1));
        return var4.method200(arg0, arg1);
    }

    @ObfuscatedName("al.j(B)V")
    public void method263() {
        Iterator var1 = this.field470.iterator();
        while (var1.hasNext()) {
            class43 var2 = (class43) var1.next();
            var2.method213(this);
        }
    }

    @ObfuscatedName("al.c(I)I")
    public int method260() {
        return this.field468;
    }

    @ObfuscatedName("al.o(I)Z")
    public boolean method261() {
        return this.field469;
    }

    @ObfuscatedName("al.q(B)Ljava/lang/String;")
    public String method288() {
        return this.field463;
    }

    @ObfuscatedName("al.n(I)Ljava/lang/String;")
    public String method311() {
        return this.field461;
    }

    @ObfuscatedName("al.a(I)I")
    public int method264() {
        return this.field462;
    }

    @ObfuscatedName("al.g(I)I")
    public int method287() {
        return this.field473;
    }

    @ObfuscatedName("al.v(I)I")
    public int method266() {
        return this.field460;
    }

    @ObfuscatedName("al.s(I)I")
    public int method267() {
        return this.field466;
    }

    @ObfuscatedName("al.k(B)I")
    public int method278() {
        return this.field467;
    }

    @ObfuscatedName("al.r(I)I")
    public int method269() {
        return this.field459;
    }

    @ObfuscatedName("al.l(I)I")
    public int method270() {
        return this.field464.field2619;
    }

    @ObfuscatedName("al.d(B)I")
    public int method271() {
        return this.field464.field2620;
    }

    @ObfuscatedName("al.x(I)I")
    public int method259() {
        return this.field464.field2622;
    }

    @ObfuscatedName("al.b(B)Lhg;")
    public class213 method273() {
        return new class213(this.field464);
    }
}
