package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("r")
public class class19 {

    @ObfuscatedName("r.n")
    public int field249;

    @ObfuscatedName("r.d")
    public class146 field257;

    @ObfuscatedName("r.s")
    public DataInputStream field244;

    @ObfuscatedName("r.q")
    public byte[] field247 = new byte[4];

    @ObfuscatedName("r.j")
    public int field254;

    @ObfuscatedName("r.k")
    public byte[] field252;

    @ObfuscatedName("r.i")
    public int field250;

    @ObfuscatedName("r.m")
    public long field251;

    public class19(class136 arg0, URL arg1) {
        this.field257 = arg0.method2725(arg1);
        this.field249 = 0;
        this.field251 = class115.method1998() + 30000L;
    }

    @ObfuscatedName("r.n(S)[B")
    public byte[] method173() throws IOException {
        if (class115.method1998() > this.field251) {
            throw new IOException();
        }
        if (this.field249 == 0) {
            if (this.field257.field2202 == 2) {
                throw new IOException();
            }
            if (this.field257.field2202 == 1) {
                this.field244 = (DataInputStream) this.field257.field2205;
                this.field249 = 1;
            }
        }
        if (this.field249 == 1) {
            int var1 = this.field244.available();
            if (var1 > 0) {
                if (this.field254 + var1 > 4) {
                    var1 = 4 - this.field254;
                }
                this.field254 += this.field244.read(this.field247, this.field254, var1);
                if (this.field254 == 4) {
                    int var2 = (new class119(this.field247)).method2343();
                    this.field252 = new byte[var2];
                    this.field249 = 2;
                }
            }
        }
        if (this.field249 == 2) {
            int var3 = this.field244.available();
            if (var3 > 0) {
                if (this.field250 + var3 > this.field252.length) {
                    var3 = this.field252.length - this.field250;
                }
                this.field250 += this.field244.read(this.field252, this.field250, var3);
                if (this.field250 == this.field252.length) {
                    return this.field252;
                }
            }
        }
        return null;
    }
}
