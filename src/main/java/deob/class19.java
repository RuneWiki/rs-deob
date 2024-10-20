package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("j")
public class class19 {

    @ObfuscatedName("j.a")
    public int field272;

    @ObfuscatedName("j.w")
    public class147 field271;

    @ObfuscatedName("j.d")
    public DataInputStream field270;

    @ObfuscatedName("j.c")
    public byte[] field273 = new byte[4];

    @ObfuscatedName("j.y")
    public int field274;

    @ObfuscatedName("j.k")
    public byte[] field275;

    @ObfuscatedName("j.r")
    public int field276;

    @ObfuscatedName("j.p")
    public long field277;

    public class19(class137 arg0, URL arg1) {
        this.field271 = arg0.method2851(arg1);
        this.field272 = 0;
        this.field277 = class116.method2781() + 30000L;
    }

    @ObfuscatedName("j.a(S)[B")
    public byte[] method218() throws IOException {
        if (class116.method2781() > this.field277) {
            throw new IOException();
        }
        if (this.field272 == 0) {
            if (this.field271.field2211 == 2) {
                throw new IOException();
            }
            if (this.field271.field2211 == 1) {
                this.field270 = (DataInputStream) this.field271.field2212;
                this.field272 = 1;
            }
        }
        if (this.field272 == 1) {
            int var1 = this.field270.available();
            if (var1 > 0) {
                if (this.field274 + var1 > 4) {
                    var1 = 4 - this.field274;
                }
                this.field274 += this.field270.read(this.field273, this.field274, var1);
                if (this.field274 == 4) {
                    int var2 = (new class120(this.field273)).method2467();
                    this.field275 = new byte[var2];
                    this.field272 = 2;
                }
            }
        }
        if (this.field272 == 2) {
            int var3 = this.field270.available();
            if (var3 > 0) {
                if (this.field276 + var3 > this.field275.length) {
                    var3 = this.field275.length - this.field276;
                }
                this.field276 += this.field270.read(this.field275, this.field276, var3);
                if (this.field276 == this.field275.length) {
                    return this.field275;
                }
            }
        }
        return null;
    }
}
