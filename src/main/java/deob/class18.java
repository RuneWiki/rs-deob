package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("k")
public class class18 {

    @ObfuscatedName("k.t")
    public int field242;

    @ObfuscatedName("k.b")
    public class138 field232;

    @ObfuscatedName("k.p")
    public DataInputStream field240;

    @ObfuscatedName("k.e")
    public byte[] field234 = new byte[4];

    @ObfuscatedName("k.i")
    public int field233;

    @ObfuscatedName("k.o")
    public byte[] field236;

    @ObfuscatedName("k.f")
    public int field237;

    @ObfuscatedName("k.d")
    public long field231;

    public class18(class128 arg0, URL arg1) {
        this.field232 = arg0.method2553(arg1);
        this.field242 = 0;
        this.field231 = class107.method591() + 30000L;
    }

    @ObfuscatedName("k.t(B)[B")
    public byte[] method175() throws IOException {
        if (class107.method591() > this.field231) {
            throw new IOException();
        }
        if (this.field242 == 0) {
            if (this.field232.field2106 == 2) {
                throw new IOException();
            }
            if (this.field232.field2106 == 1) {
                this.field240 = (DataInputStream) this.field232.field2099;
                this.field242 = 1;
            }
        }
        if (this.field242 == 1) {
            int var1 = this.field240.available();
            if (var1 > 0) {
                if (this.field233 + var1 > 4) {
                    var1 = 4 - this.field233;
                }
                this.field233 += this.field240.read(this.field234, this.field233, var1);
                if (this.field233 == 4) {
                    int var2 = (new class111(this.field234)).method2177();
                    this.field236 = new byte[var2];
                    this.field242 = 2;
                }
            }
        }
        if (this.field242 == 2) {
            int var3 = this.field240.available();
            if (var3 > 0) {
                if (this.field237 + var3 > this.field236.length) {
                    var3 = this.field236.length - this.field237;
                }
                this.field237 += this.field240.read(this.field236, this.field237, var3);
                if (this.field237 == this.field236.length) {
                    return this.field236;
                }
            }
        }
        return null;
    }
}
