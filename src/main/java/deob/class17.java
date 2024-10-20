package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("x")
public class class17 {

    @ObfuscatedName("x.t")
    public int field231;

    @ObfuscatedName("x.s")
    public class133 field229;

    @ObfuscatedName("x.f")
    public DataInputStream field235;

    @ObfuscatedName("x.e")
    public byte[] field228 = new byte[4];

    @ObfuscatedName("x.d")
    public int field236;

    @ObfuscatedName("x.n")
    public byte[] field233;

    @ObfuscatedName("x.v")
    public int field234;

    @ObfuscatedName("x.z")
    public long field232;

    public class17(class123 arg0, URL arg1) {
        this.field229 = arg0.method2470(arg1);
        this.field231 = 0;
        this.field232 = class103.method2037() + 30000L;
    }

    @ObfuscatedName("x.t(I)[B")
    public byte[] method169() throws IOException {
        if (class103.method2037() > this.field232) {
            throw new IOException();
        }
        if (this.field231 == 0) {
            if (this.field229.field2061 == 2) {
                throw new IOException();
            }
            if (this.field229.field2061 == 1) {
                this.field235 = (DataInputStream) this.field229.field2065;
                this.field231 = 1;
            }
        }
        if (this.field231 == 1) {
            int var1 = this.field235.available();
            if (var1 > 0) {
                if (this.field236 + var1 > 4) {
                    var1 = 4 - this.field236;
                }
                this.field236 += this.field235.read(this.field228, this.field236, var1);
                if (this.field236 == 4) {
                    int var2 = (new class107(this.field228)).method2106();
                    this.field233 = new byte[var2];
                    this.field231 = 2;
                }
            }
        }
        if (this.field231 == 2) {
            int var3 = this.field235.available();
            if (var3 > 0) {
                if (this.field234 + var3 > this.field233.length) {
                    var3 = this.field233.length - this.field234;
                }
                this.field234 += this.field235.read(this.field233, this.field234, var3);
                if (this.field234 == this.field233.length) {
                    return this.field233;
                }
            }
        }
        return null;
    }
}
