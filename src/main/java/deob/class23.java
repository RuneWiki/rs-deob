package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("t")
public class class23 {

    @ObfuscatedName("t.u")
    public int field382;

    @ObfuscatedName("t.k")
    public class78 field380;

    @ObfuscatedName("t.x")
    public DataInputStream field373;

    @ObfuscatedName("t.m")
    public byte[] field381 = new byte[4];

    @ObfuscatedName("t.n")
    public int field375;

    @ObfuscatedName("t.q")
    public byte[] field376;

    @ObfuscatedName("t.a")
    public int field377;

    @ObfuscatedName("t.g")
    public long field378;

    public class23(class73 arg0, URL arg1) {
        this.field380 = arg0.method1481(arg1);
        this.field382 = 0;
        this.field378 = class120.method2609() + 30000L;
    }

    @ObfuscatedName("t.u(B)[B")
    public byte[] method206() throws IOException {
        if (class120.method2609() > this.field378) {
            throw new IOException();
        }
        if (this.field382 == 0) {
            if (this.field380.field1386 == 2) {
                throw new IOException();
            }
            if (this.field380.field1386 == 1) {
                this.field373 = (DataInputStream) this.field380.field1391;
                this.field382 = 1;
            }
        }
        if (this.field382 == 1) {
            int var1 = this.field373.available();
            if (var1 > 0) {
                if (this.field375 + var1 > 4) {
                    var1 = 4 - this.field375;
                }
                this.field375 += this.field373.read(this.field381, this.field375, var1);
                if (this.field375 == 4) {
                    int var2 = (new class126(this.field381)).method2526();
                    this.field376 = new byte[var2];
                    this.field382 = 2;
                }
            }
        }
        if (this.field382 == 2) {
            int var3 = this.field373.available();
            if (var3 > 0) {
                if (this.field377 + var3 > this.field376.length) {
                    var3 = this.field376.length - this.field377;
                }
                this.field377 += this.field373.read(this.field376, this.field377, var3);
                if (this.field377 == this.field376.length) {
                    return this.field376;
                }
            }
        }
        return null;
    }
}
