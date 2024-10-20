package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("b")
public class class19 {

    @ObfuscatedName("b.m")
    public int field237;

    @ObfuscatedName("b.l")
    public class146 field232;

    @ObfuscatedName("b.y")
    public DataInputStream field238;

    @ObfuscatedName("b.u")
    public byte[] field240 = new byte[4];

    @ObfuscatedName("b.k")
    public int field231;

    @ObfuscatedName("b.j")
    public byte[] field235;

    @ObfuscatedName("b.i")
    public int field236;

    @ObfuscatedName("b.x")
    public long field234;

    public class19(class136 arg0, URL arg1) {
        this.field232 = arg0.method2776(arg1);
        this.field237 = 0;
        this.field234 = class115.method2177() + 30000L;
    }

    @ObfuscatedName("b.m(I)[B")
    public byte[] method195() throws IOException {
        if (class115.method2177() > this.field234) {
            throw new IOException();
        }
        if (this.field237 == 0) {
            if (this.field232.field2191 == 2) {
                throw new IOException();
            }
            if (this.field232.field2191 == 1) {
                this.field238 = (DataInputStream) this.field232.field2183;
                this.field237 = 1;
            }
        }
        if (this.field237 == 1) {
            int var1 = this.field238.available();
            if (var1 > 0) {
                if (this.field231 + var1 > 4) {
                    var1 = 4 - this.field231;
                }
                this.field231 += this.field238.read(this.field240, this.field231, var1);
                if (this.field231 == 4) {
                    int var2 = (new class119(this.field240)).method2386();
                    this.field235 = new byte[var2];
                    this.field237 = 2;
                }
            }
        }
        if (this.field237 == 2) {
            int var3 = this.field238.available();
            if (var3 > 0) {
                if (this.field236 + var3 > this.field235.length) {
                    var3 = this.field235.length - this.field236;
                }
                this.field236 += this.field238.read(this.field235, this.field236, var3);
                if (this.field236 == this.field235.length) {
                    return this.field235;
                }
            }
        }
        return null;
    }
}
