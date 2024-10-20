package deob;

@ObfuscatedName("fe")
public class class172 implements class188 {

    @ObfuscatedName("fe.s")
    public int field1998;

    @ObfuscatedName("fe.t")
    public int field2003;

    @ObfuscatedName("fe.v")
    public int field2000;

    @ObfuscatedName("fe.j")
    public int field2007;

    @ObfuscatedName("fe.l")
    public int field1999;

    @ObfuscatedName("fe.n")
    public int field2006;

    @ObfuscatedName("fe.w")
    public int field2004;

    @ObfuscatedName("fe.f")
    public int field2005;

    @ObfuscatedName("fe.o")
    public int field2001;

    @ObfuscatedName("fe.x")
    public int field2002;

    @ObfuscatedName("fe.s(Lfa;I)V")
    public void method2967(class168 arg0) {
        if (arg0.field1953 > this.field1999) {
            arg0.field1953 = this.field1999;
        }
        if (arg0.field1951 < this.field1999) {
            arg0.field1951 = this.field1999;
        }
        if (arg0.field1952 > this.field2006) {
            arg0.field1952 = this.field2006;
        }
        if (arg0.field1957 < this.field2006) {
            arg0.field1957 = this.field2006;
        }
    }

    @ObfuscatedName("fe.t(IIIB)Z")
    public boolean method2946(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field1998 && arg0 < this.field2003 + this.field1998) {
            return arg1 >= (this.field2004 << 3) + (this.field2000 << 6) && arg1 <= (this.field2004 << 3) + (this.field2000 << 6) + 7 && arg2 >= (this.field2007 << 6) + (this.field2005 << 3) && arg2 <= (this.field2007 << 6) + (this.field2005 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fe.v(III)Z")
    public boolean method2948(int arg0, int arg1) {
        return arg0 >= (this.field2001 << 3) + (this.field1999 << 6) && arg0 <= (this.field2001 << 3) + (this.field1999 << 6) + 7 && arg1 >= (this.field2006 << 6) + (this.field2002 << 3) && arg1 <= (this.field2006 << 6) + (this.field2002 << 3) + 7;
    }

    @ObfuscatedName("fe.j(IIII)[I")
    public int[] method2962(int arg0, int arg1, int arg2) {
        return this.method2946(arg0, arg1, arg2) ? new int[] { this.field2001 * 8 - this.field2004 * 8 + this.field1999 * 64 - this.field2000 * 64 + arg1, this.field2002 * 8 - this.field2005 * 8 + this.field2006 * 64 - this.field2007 * 64 + arg2 } : null;
    }

    @ObfuscatedName("fe.l(IIB)Lij;")
    public class245 method2947(int arg0, int arg1) {
        if (this.method2948(arg0, arg1)) {
            int var3 = this.field2004 * 8 - this.field2001 * 8 + this.field2000 * 64 - this.field1999 * 64 + arg0;
            int var4 = this.field2005 * 8 - this.field2002 * 8 + this.field2007 * 64 - this.field2006 * 64 + arg1;
            return new class245(this.field1998, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("fe.n(Lnv;I)V")
    public void method2949(class385 arg0) {
        this.field1998 = arg0.method5958();
        this.field2003 = arg0.method5958();
        this.field2000 = arg0.method6053();
        this.field2004 = arg0.method5958();
        this.field2007 = arg0.method6053();
        this.field2005 = arg0.method5958();
        this.field1999 = arg0.method6053();
        this.field2001 = arg0.method5958();
        this.field2006 = arg0.method6053();
        this.field2002 = arg0.method5958();
        this.method3212();
    }

    @ObfuscatedName("fe.w(I)V")
    public void method3212() {
    }
}
