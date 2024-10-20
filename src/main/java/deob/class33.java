package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("ab")
public class class33 {

    @ObfuscatedName("ab.c")
    public int field448 = -1;

    @ObfuscatedName("ab.o")
    public String field437;

    @ObfuscatedName("ab.i")
    public String field438;

    @ObfuscatedName("ab.u")
    public int field442 = -1;

    @ObfuscatedName("ab.g")
    public int field440 = -1;

    @ObfuscatedName("ab.m")
    public class213 field441 = null;

    @ObfuscatedName("ab.s")
    public int field444 = Integer.MAX_VALUE;

    @ObfuscatedName("ab.x")
    public int field445 = 0;

    @ObfuscatedName("ab.p")
    public int field443 = Integer.MAX_VALUE;

    @ObfuscatedName("ab.k")
    public int field436 = 0;

    @ObfuscatedName("ab.r")
    public boolean field446 = false;

    @ObfuscatedName("ab.w")
    public LinkedList field447;

    @ObfuscatedName("ab.c(Lfp;II)V")
    public void method284(class174 arg0, int arg1) {
        this.field448 = arg1;
        this.field437 = arg0.method2867();
        this.field438 = arg0.method2867();
        this.field441 = new class213(arg0.method2987());
        this.field442 = arg0.method2987();
        arg0.method2843();
        this.field446 = arg0.method2843() == 1;
        this.field440 = arg0.method2843();
        int var3 = arg0.method2843();
        this.field447 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field447.add(this.method243(arg0));
        }
        this.method248();
    }

    @ObfuscatedName("ab.o(Lfp;I)Lah;")
    public class43 method243(class174 arg0) {
        int var2 = arg0.method2843();
        class28 var3 = (class28) class169.method454(class28.method202(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field386) {
            case 0:
                var5 = new class49();
                break;
            case 1:
                var5 = new class27();
                break;
            case 2:
                var5 = new class31();
                break;
            case 3:
                var5 = new class39();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class43) var5).method177(arg0);
        return (class43) var5;
    }

    @ObfuscatedName("ab.i(IIIB)Z")
    public boolean method273(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field447.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class43) var4.next();
        } while (!var5.method173(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("ab.u(IIB)Z")
    public boolean method245(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field444 || var3 > this.field445) {
            return false;
        } else if (var4 >= this.field443 && var4 <= this.field436) {
            Iterator var5 = this.field447.iterator();
            class43 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class43) var5.next();
            } while (!var6.method174(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ab.g(IIII)[I")
    public int[] method246(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field447.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class43) var4.next();
        } while (!var5.method173(arg0, arg1, arg2));
        return var5.method175(arg0, arg1, arg2);
    }

    @ObfuscatedName("ab.m(III)Lhs;")
    public class213 method247(int arg0, int arg1) {
        Iterator var3 = this.field447.iterator();
        class43 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class43) var3.next();
        } while (!var4.method174(arg0, arg1));
        return var4.method179(arg0, arg1);
    }

    @ObfuscatedName("ab.s(S)V")
    public void method248() {
        Iterator var1 = this.field447.iterator();
        while (var1.hasNext()) {
            class43 var2 = (class43) var1.next();
            var2.method172(this);
        }
    }

    @ObfuscatedName("ab.x(I)I")
    public int method253() {
        return this.field448;
    }

    @ObfuscatedName("ab.p(B)Z")
    public boolean method250() {
        return this.field446;
    }

    @ObfuscatedName("ab.k(I)Ljava/lang/String;")
    public String method304() {
        return this.field437;
    }

    @ObfuscatedName("ab.r(B)Ljava/lang/String;")
    public String method252() {
        return this.field438;
    }

    @ObfuscatedName("ab.w(I)I")
    public int method306() {
        return this.field442;
    }

    @ObfuscatedName("ab.v(I)I")
    public int method254() {
        return this.field440;
    }

    @ObfuscatedName("ab.h(I)I")
    public int method255() {
        return this.field444;
    }

    @ObfuscatedName("ab.t(I)I")
    public int method241() {
        return this.field445;
    }

    @ObfuscatedName("ab.l(I)I")
    public int method258() {
        return this.field443;
    }

    @ObfuscatedName("ab.q(S)I")
    public int method274() {
        return this.field436;
    }

    @ObfuscatedName("ab.f(I)I")
    public int method259() {
        return this.field441.field2579;
    }

    @ObfuscatedName("ab.j(I)I")
    public int method260() {
        return this.field441.field2580;
    }

    @ObfuscatedName("ab.n(B)I")
    public int method242() {
        return this.field441.field2578;
    }

    @ObfuscatedName("ab.z(S)Lhs;")
    public class213 method262() {
        return new class213(this.field441);
    }
}
