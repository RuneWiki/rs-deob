package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("u")
public class class17 {

    @ObfuscatedName("u.f")
    public int field238;

    @ObfuscatedName("u.k")
    public class135 field234;

    @ObfuscatedName("u.y")
    public DataInputStream field247;

    @ObfuscatedName("u.e")
    public byte[] field233 = new byte[4];

    @ObfuscatedName("u.r")
    public int field235;

    @ObfuscatedName("u.a")
    public byte[] field232;

    @ObfuscatedName("u.n")
    public int field236;

    @ObfuscatedName("u.x")
    public long field237;

    public class17(class125 arg0, URL arg1) {
        this.field234 = arg0.method2528(arg1);
        this.field238 = 0;
        this.field237 = class104.method1417() + 30000L;
    }

    @ObfuscatedName("u.f(I)[B")
    public byte[] method176() throws IOException {
        if (class104.method1417() > this.field237) {
            throw new IOException();
        }
        if (this.field238 == 0) {
            if (this.field234.field2093 == 2) {
                throw new IOException();
            }
            if (this.field234.field2093 == 1) {
                this.field247 = (DataInputStream) this.field234.field2092;
                this.field238 = 1;
            }
        }
        if (this.field238 == 1) {
            int var1 = this.field247.available();
            if (var1 > 0) {
                if (this.field235 + var1 > 4) {
                    var1 = 4 - this.field235;
                }
                this.field235 += this.field247.read(this.field233, this.field235, var1);
                if (this.field235 == 4) {
                    int var2 = (new class108(this.field233)).method2256();
                    this.field232 = new byte[var2];
                    this.field238 = 2;
                }
            }
        }
        if (this.field238 == 2) {
            int var3 = this.field247.available();
            if (var3 > 0) {
                if (this.field236 + var3 > this.field232.length) {
                    var3 = this.field232.length - this.field236;
                }
                this.field236 += this.field247.read(this.field232, this.field236, var3);
                if (this.field236 == this.field232.length) {
                    return this.field232;
                }
            }
        }
        return null;
    }
}
