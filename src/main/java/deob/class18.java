package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("t")
public class class18 {

    @ObfuscatedName("t.b")
    public int field231;

    @ObfuscatedName("t.e")
    public class138 field242;

    @ObfuscatedName("t.a")
    public DataInputStream field232;

    @ObfuscatedName("t.k")
    public byte[] field237 = new byte[4];

    @ObfuscatedName("t.p")
    public int field234;

    @ObfuscatedName("t.l")
    public byte[] field239;

    @ObfuscatedName("t.u")
    public int field236;

    @ObfuscatedName("t.o")
    public long field230;

    public class18(class128 arg0, URL arg1) {
        this.field242 = arg0.method2501(arg1);
        this.field231 = 0;
        this.field230 = class107.method3468() + 30000L;
    }

    @ObfuscatedName("t.b(I)[B")
    public byte[] method178() throws IOException {
        if (class107.method3468() > this.field230) {
            throw new IOException();
        }
        if (this.field231 == 0) {
            if (this.field242.field2116 == 2) {
                throw new IOException();
            }
            if (this.field242.field2116 == 1) {
                this.field232 = (DataInputStream) this.field242.field2115;
                this.field231 = 1;
            }
        }
        if (this.field231 == 1) {
            int var1 = this.field232.available();
            if (var1 > 0) {
                if (this.field234 + var1 > 4) {
                    var1 = 4 - this.field234;
                }
                this.field234 += this.field232.read(this.field237, this.field234, var1);
                if (this.field234 == 4) {
                    int var2 = (new class111(this.field237)).method2194();
                    this.field239 = new byte[var2];
                    this.field231 = 2;
                }
            }
        }
        if (this.field231 == 2) {
            int var3 = this.field232.available();
            if (var3 > 0) {
                if (this.field236 + var3 > this.field239.length) {
                    var3 = this.field239.length - this.field236;
                }
                this.field236 += this.field232.read(this.field239, this.field236, var3);
                if (this.field236 == this.field239.length) {
                    return this.field239;
                }
            }
        }
        return null;
    }
}
