package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ep")
public final class class135 implements Runnable {

    @ObfuscatedName("ep.p")
    public InputStream field2083;

    @ObfuscatedName("ep.k")
    public OutputStream field2080;

    @ObfuscatedName("ep.e")
    public Socket field2081;

    @ObfuscatedName("ep.f")
    public boolean field2082 = false;

    @ObfuscatedName("ep.w")
    public class128 field2091;

    @ObfuscatedName("ep.t")
    public class138 field2085;

    @ObfuscatedName("ep.s")
    public byte[] field2090;

    @ObfuscatedName("ep.c")
    public int field2086 = 0;

    @ObfuscatedName("ep.d")
    public int field2079 = 0;

    @ObfuscatedName("ep.v")
    public boolean field2088 = false;

    public class135(Socket arg0, class128 arg1) throws IOException {
        this.field2091 = arg1;
        this.field2081 = arg0;
        this.field2081.setSoTimeout(30000);
        this.field2081.setTcpNoDelay(true);
        this.field2083 = this.field2081.getInputStream();
        this.field2080 = this.field2081.getOutputStream();
    }

    @ObfuscatedName("ep.e(I)V")
    public void method2643() {
        if (this.field2082) {
            return;
        }
        synchronized (this) {
            this.field2082 = true;
            this.notifyAll();
        }
        if (this.field2085 != null) {
            while (this.field2085.field2118 == 0) {
                class119.method1371(1L);
            }
            if (this.field2085.field2118 == 1) {
                try {
                    ((Thread) this.field2085.field2125).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2085 = null;
    }

    public void finalize() {
        this.method2643();
    }

    @ObfuscatedName("ep.f(I)I")
    public int method2644() throws IOException {
        return this.field2082 ? 0 : this.field2083.read();
    }

    @ObfuscatedName("ep.w(I)I")
    public int method2656() throws IOException {
        return this.field2082 ? 0 : this.field2083.available();
    }

    @ObfuscatedName("ep.t([BIII)V")
    public void method2646(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2082) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2083.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("ep.s([BIII)V")
    public void method2658(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2082) {
            return;
        }
        if (this.field2088) {
            this.field2088 = false;
            throw new IOException();
        }
        if (this.field2090 == null) {
            this.field2090 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2090[this.field2079] = arg0[arg1 + var5];
                this.field2079 = (this.field2079 + 1) % 5000;
                if ((this.field2086 + 4900) % 5000 == this.field2079) {
                    throw new IOException();
                }
            }
            if (this.field2085 == null) {
                this.field2085 = this.field2091.method2547(this, 3);
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
                        if (this.field2086 == this.field2079) {
                            if (this.field2082) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2086;
                        if (this.field2079 >= this.field2086) {
                            var4 = this.field2079 - this.field2086;
                        } else {
                            var4 = 5000 - this.field2086;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2080.write(this.field2090, var3, var4);
                    } catch (IOException var12) {
                        this.field2088 = true;
                    }
                    this.field2086 = (this.field2086 + var4) % 5000;
                    try {
                        if (this.field2086 == this.field2079) {
                            this.field2080.flush();
                        }
                    } catch (IOException var11) {
                        this.field2088 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2083 != null) {
                        this.field2083.close();
                    }
                    if (this.field2080 != null) {
                        this.field2080.close();
                    }
                    if (this.field2081 != null) {
                        this.field2081.close();
                    }
                } catch (IOException var10) {
                }
                this.field2090 = null;
                break;
            }
        } catch (Exception var15) {
            class140.method1((String) null, var15);
        }
    }
}
