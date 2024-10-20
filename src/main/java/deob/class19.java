package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("o")
public class class19 {

    @ObfuscatedName("o.a")
    public int field257;

    @ObfuscatedName("o.d")
    public class150 field251;

    @ObfuscatedName("o.v")
    public DataInputStream field265;

    @ObfuscatedName("o.r")
    public byte[] field253 = new byte[4];

    @ObfuscatedName("o.z")
    public int field254;

    @ObfuscatedName("o.t")
    public byte[] field255;

    @ObfuscatedName("o.n")
    public int field256;

    @ObfuscatedName("o.i")
    public long field259;

    public class19(class140 arg0, URL arg1) {
        this.field251 = arg0.method2775(arg1);
        this.field257 = 0;
        this.field259 = class119.method64() + 30000L;
    }

    @ObfuscatedName("o.a(B)[B")
    public byte[] method194() throws IOException {
        if (class119.method64() > this.field259) {
            throw new IOException();
        }
        if (this.field257 == 0) {
            if (this.field251.field2285 == 2) {
                throw new IOException();
            }
            if (this.field251.field2285 == 1) {
                this.field265 = (DataInputStream) this.field251.field2288;
                this.field257 = 1;
            }
        }
        if (this.field257 == 1) {
            int var1 = this.field265.available();
            if (var1 > 0) {
                if (this.field254 + var1 > 4) {
                    var1 = 4 - this.field254;
                }
                this.field254 += this.field265.read(this.field253, this.field254, var1);
                if (this.field254 == 4) {
                    int var2 = (new class123(this.field253)).method2400();
                    this.field255 = new byte[var2];
                    this.field257 = 2;
                }
            }
        }
        if (this.field257 == 2) {
            int var3 = this.field265.available();
            if (var3 > 0) {
                if (this.field256 + var3 > this.field255.length) {
                    var3 = this.field255.length - this.field256;
                }
                this.field256 += this.field265.read(this.field255, this.field256, var3);
                if (this.field256 == this.field255.length) {
                    return this.field255;
                }
            }
        }
        return null;
    }
}
