package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("m")
public class class70 {

    @ObfuscatedName("m.f")
    public long field783;

    @ObfuscatedName("m.d")
    public byte[] field776;

    @ObfuscatedName("m.b")
    public int field786;

    @ObfuscatedName("m.l")
    public int field782;

    @ObfuscatedName("m.k")
    public DataInputStream field778;

    @ObfuscatedName("m.h")
    public class152 field777;

    @ObfuscatedName("m.w")
    public byte[] field779 = new byte[4];

    @ObfuscatedName("m.t")
    public int field787;

    @ObfuscatedName("m.b(I)[B")
    public byte[] method1144() throws IOException {
        if (class38.method2385() > this.field783) {
            throw new IOException();
        }
        if (this.field786 == 0) {
            if (this.field777.field2270 == 2) {
                throw new IOException();
            }
            if (this.field777.field2270 == 1) {
                this.field778 = (DataInputStream) this.field777.field2274;
                this.field786 = 1;
            }
        }
        if (this.field786 == 1) {
            int var1 = this.field778.available();
            if (var1 > 0) {
                if (this.field787 + var1 > 4) {
                    var1 = 4 - this.field787;
                }
                this.field787 += this.field778.read(this.field779, this.field787, var1);
                if (this.field787 == 4) {
                    int var2 = (new class50(this.field779)).method685();
                    this.field776 = new byte[var2];
                    this.field786 = 2;
                }
            }
        }
        if (this.field786 == 2) {
            int var3 = this.field778.available();
            if (var3 > 0) {
                if (this.field782 + var3 > this.field776.length) {
                    var3 = this.field776.length - this.field782;
                }
                this.field782 += this.field778.read(this.field776, this.field782, var3);
                if (this.field782 == this.field776.length) {
                    return this.field776;
                }
            }
        }
        return null;
    }

    public class70(class116 arg0, URL arg1) {
        this.field777 = arg0.method2073(arg1);
        this.field786 = 0;
        this.field783 = class38.method2385() + 30000L;
    }
}
