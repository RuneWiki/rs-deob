package jaclib.memory;

import deob.ObfuscatedName;

public class Stream {

    @ObfuscatedName("jaclib/memory/Stream.e")
    public Buffer field404;

    @ObfuscatedName("jaclib/memory/Stream.n")
    public int field405;

    @ObfuscatedName("jaclib/memory/Stream.m")
    public int field406;

    @ObfuscatedName("jaclib/memory/Stream.k")
    public int field407;

    @ObfuscatedName("jaclib/memory/Stream.f")
    public final byte[] field408;

    @ObfuscatedName("jaclib/memory/Stream.w")
    public static final boolean field409 = getLSB(-65536) == -1;

    public Stream() {
        this(4096);
    }

    public Stream(int arg0) {
        this.field408 = new byte[arg0];
    }

    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.method49());
    }

    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.method49() < 4096 ? arg0.method49() : 4096);
        this.method55(arg0, arg1, arg2);
    }

    @ObfuscatedName("jaclib/memory/Stream.e(Ljaclib/memory/Buffer;II)V")
    public void method55(Buffer arg0, int arg1, int arg2) {
        this.method61();
        this.field404 = arg0;
        this.field406 = arg1;
        this.field405 = arg1 + arg2;
        if (this.field405 > arg0.method49()) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("jaclib/memory/Stream.n()I")
    public int method56() {
        return this.field407 + this.field406;
    }

    @ObfuscatedName("jaclib/memory/Stream.m(I)V")
    public void method57(int arg0) {
        this.method61();
        this.field406 = arg0;
    }

    @ObfuscatedName("jaclib/memory/Stream.k(I)V")
    public void method58(int arg0) {
        if (this.field407 >= this.field408.length) {
            this.method61();
        }
        this.field408[++this.field407 - 1] = (byte) arg0;
    }

    @ObfuscatedName("jaclib/memory/Stream.f(F)V")
    public void method59(float arg0) {
        if (this.field407 + 3 >= this.field408.length) {
            this.method61();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field408[++this.field407 - 1] = (byte) (var2 >> 24);
        this.field408[++this.field407 - 1] = (byte) (var2 >> 16);
        this.field408[++this.field407 - 1] = (byte) (var2 >> 8);
        this.field408[++this.field407 - 1] = (byte) var2;
    }

    @ObfuscatedName("jaclib/memory/Stream.w(F)V")
    public void method60(float arg0) {
        if (this.field407 + 3 >= this.field408.length) {
            this.method61();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field408[++this.field407 - 1] = (byte) var2;
        this.field408[++this.field407 - 1] = (byte) (var2 >> 8);
        this.field408[++this.field407 - 1] = (byte) (var2 >> 16);
        this.field408[++this.field407 - 1] = (byte) (var2 >> 24);
    }

    @ObfuscatedName("jaclib/memory/Stream.l()V")
    public void method61() {
        if (this.field407 <= 0) {
            return;
        }
        if (this.field407 + this.field406 > this.field405) {
            throw new RuntimeException();
        }
        this.field404.method9(this.field408, 0, this.field406, this.field407);
        this.field406 += this.field407;
        this.field407 = 0;
    }

    @ObfuscatedName("jaclib/memory/Stream.u()Z")
    public static final boolean method62() {
        return field409;
    }

    public static native int floatToRawIntBits(float arg0);

    public static final native byte getLSB(int arg0);
}
