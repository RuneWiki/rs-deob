package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("j")
public class class18 {

    @ObfuscatedName("j.q")
    public int field249;

    @ObfuscatedName("j.s")
    public class138 field248;

    @ObfuscatedName("j.h")
    public DataInputStream field259;

    @ObfuscatedName("j.e")
    public byte[] field250 = new byte[4];

    @ObfuscatedName("j.n")
    public int field255;

    @ObfuscatedName("j.t")
    public byte[] field252;

    @ObfuscatedName("j.l")
    public int field253;

    @ObfuscatedName("j.m")
    public long field254;

    public class18(class128 arg0, URL arg1) {
        this.field248 = arg0.method2503(arg1);
        this.field249 = 0;
        this.field254 = class107.method2434() + 30000L;
    }

    @ObfuscatedName("j.q(B)[B")
    public byte[] method168() throws IOException {
        if (class107.method2434() > this.field254) {
            throw new IOException();
        }
        if (this.field249 == 0) {
            if (this.field248.field2063 == 2) {
                throw new IOException();
            }
            if (this.field248.field2063 == 1) {
                this.field259 = (DataInputStream) this.field248.field2067;
                this.field249 = 1;
            }
        }
        if (this.field249 == 1) {
            int var1 = this.field259.available();
            if (var1 > 0) {
                if (this.field255 + var1 > 4) {
                    var1 = 4 - this.field255;
                }
                this.field255 += this.field259.read(this.field250, this.field255, var1);
                if (this.field255 == 4) {
                    int var2 = (new class111(this.field250)).method2153();
                    this.field252 = new byte[var2];
                    this.field249 = 2;
                }
            }
        }
        if (this.field249 == 2) {
            int var3 = this.field259.available();
            if (var3 > 0) {
                if (this.field253 + var3 > this.field252.length) {
                    var3 = this.field252.length - this.field253;
                }
                this.field253 += this.field259.read(this.field252, this.field253, var3);
                if (this.field253 == this.field252.length) {
                    return this.field252;
                }
            }
        }
        return null;
    }
}
