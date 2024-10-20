package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("e")
public class class17 {

    @ObfuscatedName("e.v")
    public int field234;

    @ObfuscatedName("e.t")
    public class137 field233;

    @ObfuscatedName("e.f")
    public DataInputStream field241;

    @ObfuscatedName("e.j")
    public byte[] field235 = new byte[4];

    @ObfuscatedName("e.l")
    public int field236;

    @ObfuscatedName("e.g")
    public byte[] field237;

    @ObfuscatedName("e.k")
    public int field243;

    @ObfuscatedName("e.p")
    public long field239;

    public class17(class127 arg0, URL arg1) {
        this.field233 = arg0.method2531(arg1);
        this.field234 = 0;
        this.field239 = class106.method487() + 30000L;
    }

    @ObfuscatedName("e.v(I)[B")
    public byte[] method158() throws IOException {
        if (class106.method487() > this.field239) {
            throw new IOException();
        }
        if (this.field234 == 0) {
            if (this.field233.field2078 == 2) {
                throw new IOException();
            }
            if (this.field233.field2078 == 1) {
                this.field241 = (DataInputStream) this.field233.field2079;
                this.field234 = 1;
            }
        }
        if (this.field234 == 1) {
            int var1 = this.field241.available();
            if (var1 > 0) {
                if (this.field236 + var1 > 4) {
                    var1 = 4 - this.field236;
                }
                this.field236 += this.field241.read(this.field235, this.field236, var1);
                if (this.field236 == 4) {
                    int var2 = (new class110(this.field235)).method2297();
                    this.field237 = new byte[var2];
                    this.field234 = 2;
                }
            }
        }
        if (this.field234 == 2) {
            int var3 = this.field241.available();
            if (var3 > 0) {
                if (this.field243 + var3 > this.field237.length) {
                    var3 = this.field237.length - this.field243;
                }
                this.field243 += this.field241.read(this.field237, this.field243, var3);
                if (this.field243 == this.field237.length) {
                    return this.field237;
                }
            }
        }
        return null;
    }
}
