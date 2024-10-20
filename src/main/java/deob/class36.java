package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("av")
public class class36 {

    @ObfuscatedName("av.h")
    public int field238 = -1;

    @ObfuscatedName("av.v")
    public String field246;

    @ObfuscatedName("av.x")
    public String field231;

    @ObfuscatedName("av.w")
    public int field232 = -1;

    @ObfuscatedName("av.t")
    public int field233 = -1;

    @ObfuscatedName("av.j")
    public class223 field234 = null;

    @ObfuscatedName("av.n")
    public int field235 = Integer.MAX_VALUE;

    @ObfuscatedName("av.p")
    public int field229 = 0;

    @ObfuscatedName("av.l")
    public int field237 = Integer.MAX_VALUE;

    @ObfuscatedName("av.z")
    public int field240 = 0;

    @ObfuscatedName("av.u")
    public boolean field239 = false;

    @ObfuscatedName("av.e")
    public LinkedList field236;

    @ObfuscatedName("av.h(Lkj;II)V")
    public void method339(class311 arg0, int arg1) {
        this.field238 = arg1;
        this.field246 = arg0.method5202();
        this.field231 = arg0.method5202();
        this.field234 = new class223(arg0.method5120());
        this.field232 = arg0.method5120();
        arg0.method5274();
        this.field239 = arg0.method5274() == 1;
        this.field233 = arg0.method5274();
        int var3 = arg0.method5274();
        this.field236 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field236.add(this.method328(arg0));
        }
        this.method333();
    }

    @ObfuscatedName("av.v(Lkj;I)Lal;")
    public class47 method328(class311 arg0) {
        int var2 = arg0.method5274();
        class30 var3 = (class30) class205.method3134(class30.method272(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field171) {
            case 0:
                var5 = new class43();
                break;
            case 1:
                var5 = new class34();
                break;
            case 2:
                var5 = new class52();
                break;
            case 3:
                var5 = new class29();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class47) var5).method257(arg0);
        return (class47) var5;
    }

    @ObfuscatedName("av.x(IIII)Z")
    public boolean method329(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field236.iterator();
        class47 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class47) var4.next();
        } while (!var5.method253(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("av.w(III)Z")
    public boolean method330(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field235 || var3 > this.field229) {
            return false;
        } else if (var4 >= this.field237 && var4 <= this.field240) {
            Iterator var5 = this.field236.iterator();
            class47 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class47) var5.next();
            } while (!var6.method254(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("av.t(IIII)[I")
    public int[] method331(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field236.iterator();
        class47 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class47) var4.next();
        } while (!var5.method253(arg0, arg1, arg2));
        return var5.method255(arg0, arg1, arg2);
    }

    @ObfuscatedName("av.j(IIB)Lhs;")
    public class223 method326(int arg0, int arg1) {
        Iterator var3 = this.field236.iterator();
        class47 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class47) var3.next();
        } while (!var4.method254(arg0, arg1));
        return var4.method256(arg0, arg1);
    }

    @ObfuscatedName("av.n(I)V")
    public void method333() {
        Iterator var1 = this.field236.iterator();
        while (var1.hasNext()) {
            class47 var2 = (class47) var1.next();
            var2.method252(this);
        }
    }

    @ObfuscatedName("av.p(I)I")
    public int method334() {
        return this.field238;
    }

    @ObfuscatedName("av.l(I)Z")
    public boolean method335() {
        return this.field239;
    }

    @ObfuscatedName("av.z(I)Ljava/lang/String;")
    public String method336() {
        return this.field246;
    }

    @ObfuscatedName("av.u(I)Ljava/lang/String;")
    public String method337() {
        return this.field231;
    }

    @ObfuscatedName("av.e(I)I")
    public int method392() {
        return this.field232;
    }

    @ObfuscatedName("av.m(B)I")
    public int method399() {
        return this.field233;
    }

    @ObfuscatedName("av.c(B)I")
    public int method340() {
        return this.field235;
    }

    @ObfuscatedName("av.i(I)I")
    public int method367() {
        return this.field229;
    }

    @ObfuscatedName("av.f(I)I")
    public int method342() {
        return this.field237;
    }

    @ObfuscatedName("av.y(I)I")
    public int method388() {
        return this.field240;
    }

    @ObfuscatedName("av.r(I)I")
    public int method344() {
        return this.field234.field2547;
    }

    @ObfuscatedName("av.q(I)I")
    public int method345() {
        return this.field234.field2550;
    }

    @ObfuscatedName("av.g(I)I")
    public int method346() {
        return this.field234.field2548;
    }

    @ObfuscatedName("av.o(I)Lhs;")
    public class223 method397() {
        return new class223(this.field234);
    }
}
