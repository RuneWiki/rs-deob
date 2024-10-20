package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("d")
public class class19 {

    @ObfuscatedName("d.m")
    public int field246;

    @ObfuscatedName("d.w")
    public class150 field242;

    @ObfuscatedName("d.e")
    public DataInputStream field245;

    @ObfuscatedName("d.o")
    public byte[] field244 = new byte[4];

    @ObfuscatedName("d.g")
    public int field241;

    @ObfuscatedName("d.l")
    public byte[] field248;

    @ObfuscatedName("d.j")
    public int field243;

    @ObfuscatedName("d.r")
    public long field247;

    public class19(class140 arg0, URL arg1) {
        this.field242 = arg0.method2792(arg1);
        this.field246 = 0;
        this.field247 = class119.method3544() + 30000L;
    }

    @ObfuscatedName("d.m(I)[B")
    public byte[] method180() throws IOException {
        if (class119.method3544() > this.field247) {
            throw new IOException();
        }
        if (this.field246 == 0) {
            if (this.field242.field2279 == 2) {
                throw new IOException();
            }
            if (this.field242.field2279 == 1) {
                this.field245 = (DataInputStream) this.field242.field2283;
                this.field246 = 1;
            }
        }
        if (this.field246 == 1) {
            int var1 = this.field245.available();
            if (var1 > 0) {
                if (this.field241 + var1 > 4) {
                    var1 = 4 - this.field241;
                }
                this.field241 += this.field245.read(this.field244, this.field241, var1);
                if (this.field241 == 4) {
                    int var2 = (new class123(this.field244)).method2419();
                    this.field248 = new byte[var2];
                    this.field246 = 2;
                }
            }
        }
        if (this.field246 == 2) {
            int var3 = this.field245.available();
            if (var3 > 0) {
                if (this.field243 + var3 > this.field248.length) {
                    var3 = this.field248.length - this.field243;
                }
                this.field243 += this.field245.read(this.field248, this.field243, var3);
                if (this.field243 == this.field248.length) {
                    return this.field248;
                }
            }
        }
        return null;
    }
}
