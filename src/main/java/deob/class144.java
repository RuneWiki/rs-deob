package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ez")
public final class class144 implements Runnable {

    @ObfuscatedName("ez.w")
    public InputStream field2211;

    @ObfuscatedName("ez.x")
    public OutputStream field2202;

    @ObfuscatedName("ez.t")
    public Socket field2200;

    @ObfuscatedName("ez.p")
    public boolean field2203 = false;

    @ObfuscatedName("ez.e")
    public class137 field2209;

    @ObfuscatedName("ez.y")
    public class147 field2205;

    @ObfuscatedName("ez.m")
    public byte[] field2206;

    @ObfuscatedName("ez.c")
    public int field2201 = 0;

    @ObfuscatedName("ez.v")
    public int field2208 = 0;

    @ObfuscatedName("ez.l")
    public boolean field2207 = false;

    public class144(Socket arg0, class137 arg1) throws IOException {
        this.field2209 = arg1;
        this.field2200 = arg0;
        this.field2200.setSoTimeout(30000);
        this.field2200.setTcpNoDelay(true);
        this.field2200.setReceiveBufferSize(16384);
        this.field2200.setSendBufferSize(16384);
        this.field2211 = this.field2200.getInputStream();
        this.field2202 = this.field2200.getOutputStream();
    }

    @ObfuscatedName("ez.x(B)V")
    public void method2847() {
        if (this.field2203) {
            return;
        }
        synchronized (this) {
            this.field2203 = true;
            this.notifyAll();
        }
        if (this.field2205 != null) {
            while (this.field2205.field2236 == 0) {
                class128.method2158(1L);
            }
            if (this.field2205.field2236 == 1) {
                try {
                    ((Thread) this.field2205.field2235).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2205 = null;
    }

    public void finalize() {
        this.method2847();
    }

    @ObfuscatedName("ez.t(I)I")
    public int method2841() throws IOException {
        return this.field2203 ? 0 : this.field2211.read();
    }

    @ObfuscatedName("ez.p(I)I")
    public int method2842() throws IOException {
        return this.field2203 ? 0 : this.field2211.available();
    }

    @ObfuscatedName("ez.e([BIIB)V")
    public void method2843(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2203) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2211.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("ez.y([BIII)V")
    public void method2844(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2203) {
            return;
        }
        if (this.field2207) {
            this.field2207 = false;
            throw new IOException();
        }
        if (this.field2206 == null) {
            this.field2206 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2206[this.field2208] = arg0[arg1 + var5];
                this.field2208 = (this.field2208 + 1) % 5000;
                if ((this.field2201 + 4900) % 5000 == this.field2208) {
                    throw new IOException();
                }
            }
            if (this.field2205 == null) {
                this.field2205 = this.field2209.method2739(this, 3);
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
                        if (this.field2208 == this.field2201) {
                            if (this.field2203) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2201;
                        if (this.field2208 >= this.field2201) {
                            var4 = this.field2208 - this.field2201;
                        } else {
                            var4 = 5000 - this.field2201;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2202.write(this.field2206, var3, var4);
                    } catch (IOException var12) {
                        this.field2207 = true;
                    }
                    this.field2201 = (this.field2201 + var4) % 5000;
                    try {
                        if (this.field2208 == this.field2201) {
                            this.field2202.flush();
                        }
                    } catch (IOException var11) {
                        this.field2207 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2211 != null) {
                        this.field2211.close();
                    }
                    if (this.field2202 != null) {
                        this.field2202.close();
                    }
                    if (this.field2200 != null) {
                        this.field2200.close();
                    }
                } catch (IOException var10) {
                }
                this.field2206 = null;
                break;
            }
        } catch (Exception var15) {
            class149.method1((String) null, var15);
        }
    }
}
