package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ed")
public final class class143 implements Runnable {

    @ObfuscatedName("ed.c")
    public InputStream field2148;

    @ObfuscatedName("ed.h")
    public OutputStream field2145;

    @ObfuscatedName("ed.k")
    public Socket field2146;

    @ObfuscatedName("ed.t")
    public boolean field2144 = false;

    @ObfuscatedName("ed.g")
    public class136 field2149;

    @ObfuscatedName("ed.o")
    public class146 field2158;

    @ObfuscatedName("ed.i")
    public byte[] field2150;

    @ObfuscatedName("ed.w")
    public int field2147 = 0;

    @ObfuscatedName("ed.m")
    public int field2152 = 0;

    @ObfuscatedName("ed.r")
    public boolean field2153 = false;

    public class143(Socket arg0, class136 arg1) throws IOException {
        this.field2149 = arg1;
        this.field2146 = arg0;
        this.field2146.setSoTimeout(30000);
        this.field2146.setTcpNoDelay(true);
        this.field2148 = this.field2146.getInputStream();
        this.field2145 = this.field2146.getOutputStream();
    }

    @ObfuscatedName("ed.h(B)V")
    public void method2763() {
        if (this.field2144) {
            return;
        }
        synchronized (this) {
            this.field2144 = true;
            this.notifyAll();
        }
        if (this.field2158 != null) {
            while (this.field2158.field2184 == 0) {
                class127.method2079(1L);
            }
            if (this.field2158.field2184 == 1) {
                try {
                    ((Thread) this.field2158.field2188).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2158 = null;
    }

    public void finalize() {
        this.method2763();
    }

    @ObfuscatedName("ed.k(I)I")
    public int method2764() throws IOException {
        return this.field2144 ? 0 : this.field2148.read();
    }

    @ObfuscatedName("ed.t(I)I")
    public int method2765() throws IOException {
        return this.field2144 ? 0 : this.field2148.available();
    }

    @ObfuscatedName("ed.g([BIIB)V")
    public void method2768(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2144) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2148.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("ed.o([BIIB)V")
    public void method2767(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2144) {
            return;
        }
        if (this.field2153) {
            this.field2153 = false;
            throw new IOException();
        }
        if (this.field2150 == null) {
            this.field2150 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2150[this.field2152] = arg0[arg1 + var5];
                this.field2152 = (this.field2152 + 1) % 5000;
                if ((this.field2147 + 4900) % 5000 == this.field2152) {
                    throw new IOException();
                }
            }
            if (this.field2158 == null) {
                this.field2158 = this.field2149.method2680(this, 3);
            }
            this.notifyAll();
        }
    }

    public void run() {
        try {
            while (true) {
                label84: {
                    int var3;
                    int var4;
                    synchronized (this) {
                        if (this.field2152 == this.field2147) {
                            if (this.field2144) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2147;
                        if (this.field2152 >= this.field2147) {
                            var4 = this.field2152 - this.field2147;
                        } else {
                            var4 = 5000 - this.field2147;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2145.write(this.field2150, var3, var4);
                    } catch (IOException var12) {
                        this.field2153 = true;
                    }
                    this.field2147 = (this.field2147 + var4) % 5000;
                    try {
                        if (this.field2152 == this.field2147) {
                            this.field2145.flush();
                        }
                    } catch (IOException var11) {
                        this.field2153 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2148 != null) {
                        this.field2148.close();
                    }
                    if (this.field2145 != null) {
                        this.field2145.close();
                    }
                    if (this.field2146 != null) {
                        this.field2146.close();
                    }
                } catch (IOException var10) {
                }
                this.field2150 = null;
                break;
            }
        } catch (Exception var15) {
            class148.method2598((String) null, var15);
        }
    }
}
