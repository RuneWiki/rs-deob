package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("d")
public class class17 {

    @ObfuscatedName("d.g")
    public int field254;

    @ObfuscatedName("d.s")
    public class133 field245;

    @ObfuscatedName("d.v")
    public DataInputStream field244;

    @ObfuscatedName("d.o")
    public byte[] field247 = new byte[4];

    @ObfuscatedName("d.k")
    public int field248;

    @ObfuscatedName("d.m")
    public byte[] field249;

    @ObfuscatedName("d.i")
    public int field250;

    @ObfuscatedName("d.t")
    public long field251;

    public class17(class123 arg0, URL arg1) {
        this.field245 = arg0.method2416(arg1);
        this.field254 = 0;
        this.field251 = class103.method1837() + 30000L;
    }

    @ObfuscatedName("d.g(I)[B")
    public byte[] method163() throws IOException {
        if (class103.method1837() > this.field251) {
            throw new IOException();
        }
        if (this.field254 == 0) {
            if (this.field245.field2089 == 2) {
                throw new IOException();
            }
            if (this.field245.field2089 == 1) {
                this.field244 = (DataInputStream) this.field245.field2086;
                this.field254 = 1;
            }
        }
        if (this.field254 == 1) {
            int var1 = this.field244.available();
            if (var1 > 0) {
                if (this.field248 + var1 > 4) {
                    var1 = 4 - this.field248;
                }
                this.field248 += this.field244.read(this.field247, this.field248, var1);
                if (this.field248 == 4) {
                    int var2 = (new class107(this.field247)).method2097();
                    this.field249 = new byte[var2];
                    this.field254 = 2;
                }
            }
        }
        if (this.field254 == 2) {
            int var3 = this.field244.available();
            if (var3 > 0) {
                if (this.field250 + var3 > this.field249.length) {
                    var3 = this.field249.length - this.field250;
                }
                this.field250 += this.field244.read(this.field249, this.field250, var3);
                if (this.field250 == this.field249.length) {
                    return this.field249;
                }
            }
        }
        return null;
    }
}
