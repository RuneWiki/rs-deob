package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("ai")
public class class33 {

    @ObfuscatedName("ai.b")
    public int field418 = -1;

    @ObfuscatedName("ai.q")
    public String field419;

    @ObfuscatedName("ai.o")
    public String field422;

    @ObfuscatedName("ai.p")
    public int field417 = -1;

    @ObfuscatedName("ai.a")
    public int field415 = -1;

    @ObfuscatedName("ai.h")
    public class233 field428 = null;

    @ObfuscatedName("ai.l")
    public int field420 = Integer.MAX_VALUE;

    @ObfuscatedName("ai.y")
    public int field421 = 0;

    @ObfuscatedName("ai.g")
    public int field414 = Integer.MAX_VALUE;

    @ObfuscatedName("ai.c")
    public int field423 = 0;

    @ObfuscatedName("ai.u")
    public boolean field424 = false;

    @ObfuscatedName("ai.r")
    public LinkedList field425;

    @ObfuscatedName("ai.b(Lgn;II)V")
    public void method268(class194 arg0, int arg1) {
        this.field418 = arg1;
        this.field419 = arg0.method3256();
        this.field422 = arg0.method3256();
        this.field428 = new class233(arg0.method3261());
        this.field417 = arg0.method3261();
        arg0.method3247();
        this.field424 = arg0.method3247() == 1;
        this.field415 = arg0.method3247();
        int var3 = arg0.method3247();
        this.field425 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field425.add(this.method269(arg0));
        }
        this.method274();
    }

    @ObfuscatedName("ai.q(Lgn;B)Lau;")
    public class43 method269(class194 arg0) {
        int var2 = arg0.method3247();
        class28 var3 = (class28) class189.method2486(class28.method218(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field369) {
            case 0:
                var5 = new class39();
                break;
            case 1:
                var5 = new class31();
                break;
            case 2:
                var5 = new class49();
                break;
            case 3:
                var5 = new class27();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class43) var5).method197(arg0);
        return (class43) var5;
    }

    @ObfuscatedName("ai.o(IIIS)Z")
    public boolean method295(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field425.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class43) var4.next();
        } while (!var5.method194(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("ai.p(IIB)Z")
    public boolean method291(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field420 || var3 > this.field421) {
            return false;
        } else if (var4 >= this.field414 && var4 <= this.field423) {
            Iterator var5 = this.field425.iterator();
            class43 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class43) var5.next();
            } while (!var6.method195(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ai.a(IIII)[I")
    public int[] method292(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field425.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class43) var4.next();
        } while (!var5.method194(arg0, arg1, arg2));
        return var5.method214(arg0, arg1, arg2);
    }

    @ObfuscatedName("ai.h(III)Lhp;")
    public class233 method273(int arg0, int arg1) {
        Iterator var3 = this.field425.iterator();
        class43 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class43) var3.next();
        } while (!var4.method195(arg0, arg1));
        return var4.method192(arg0, arg1);
    }

    @ObfuscatedName("ai.l(B)V")
    public void method274() {
        Iterator var1 = this.field425.iterator();
        while (var1.hasNext()) {
            class43 var2 = (class43) var1.next();
            var2.method193(this);
        }
    }

    @ObfuscatedName("ai.y(I)I")
    public int method275() {
        return this.field418;
    }

    @ObfuscatedName("ai.g(I)Z")
    public boolean method298() {
        return this.field424;
    }

    @ObfuscatedName("ai.c(B)Ljava/lang/String;")
    public String method277() {
        return this.field419;
    }

    @ObfuscatedName("ai.u(I)Ljava/lang/String;")
    public String method278() {
        return this.field422;
    }

    @ObfuscatedName("ai.t(B)I")
    public int method272() {
        return this.field417;
    }

    @ObfuscatedName("ai.f(I)I")
    public int method280() {
        return this.field415;
    }

    @ObfuscatedName("ai.m(I)I")
    public int method281() {
        return this.field420;
    }

    @ObfuscatedName("ai.x(I)I")
    public int method282() {
        return this.field421;
    }

    @ObfuscatedName("ai.w(B)I")
    public int method318() {
        return this.field414;
    }

    @ObfuscatedName("ai.j(I)I")
    public int method284() {
        return this.field423;
    }

    @ObfuscatedName("ai.z(B)I")
    public int method285() {
        return this.field428.field2742;
    }

    @ObfuscatedName("ai.e(B)I")
    public int method286() {
        return this.field428.field2741;
    }

    @ObfuscatedName("ai.k(I)I")
    public int method331() {
        return this.field428.field2743;
    }

    @ObfuscatedName("ai.ao(I)Lhp;")
    public class233 method283() {
        return new class233(this.field428);
    }
}
