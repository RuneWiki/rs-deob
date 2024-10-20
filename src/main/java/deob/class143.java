package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ev")
public final class class143 implements Runnable {

    @ObfuscatedName("ev.o")
    public Socket field2172;

    @ObfuscatedName("ev.f")
    public InputStream field2165;

    @ObfuscatedName("ev.i")
    public OutputStream field2164;

    @ObfuscatedName("ev.h")
    public boolean field2167 = false;

    @ObfuscatedName("ev.q")
    public class136 field2168;

    @ObfuscatedName("ev.u")
    public class146 field2169;

    @ObfuscatedName("ev.m")
    public byte[] field2170;

    @ObfuscatedName("ev.y")
    public int field2171 = 0;

    @ObfuscatedName("ev.p")
    public int field2166 = 0;

    @ObfuscatedName("ev.t")
    public boolean field2173 = false;

    public class143(Socket arg0, class136 arg1) throws IOException {
        this.field2168 = arg1;
        this.field2172 = arg0;
        this.field2172.setSoTimeout(30000);
        this.field2172.setTcpNoDelay(true);
        this.field2172.setReceiveBufferSize(16384);
        this.field2172.setSendBufferSize(16384);
        this.field2165 = this.field2172.getInputStream();
        this.field2164 = this.field2172.getOutputStream();
    }

    @ObfuscatedName("ev.i(I)V")
    public void method2784() {
        if (this.field2167) {
            return;
        }
        synchronized (this) {
            this.field2167 = true;
            this.notifyAll();
        }
        if (this.field2169 != null) {
            while (this.field2169.field2204 == 0) {
                class127.method16(1L);
            }
            if (this.field2169.field2204 == 1) {
                try {
                    ((Thread) this.field2169.field2200).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2169 = null;
    }

    public void finalize() {
        this.method2784();
    }

    @ObfuscatedName("ev.h(I)I")
    public int method2768() throws IOException {
        return this.field2167 ? 0 : this.field2165.read();
    }

    @ObfuscatedName("ev.q(I)I")
    public int method2780() throws IOException {
        return this.field2167 ? 0 : this.field2165.available();
    }

    @ObfuscatedName("ev.u([BIII)V")
    public void method2770(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2167) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2165.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("ev.m([BIIB)V")
    public void method2771(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2167) {
            return;
        }
        if (this.field2173) {
            this.field2173 = false;
            throw new IOException();
        }
        if (this.field2170 == null) {
            this.field2170 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2170[this.field2166] = arg0[arg1 + var5];
                this.field2166 = (this.field2166 + 1) % 5000;
                if ((this.field2171 + 4900) % 5000 == this.field2166) {
                    throw new IOException();
                }
            }
            if (this.field2169 == null) {
                this.field2169 = this.field2168.method2666(this, 3);
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
                        if (this.field2171 == this.field2166) {
                            if (this.field2167) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2171;
                        if (this.field2166 >= this.field2171) {
                            var4 = this.field2166 - this.field2171;
                        } else {
                            var4 = 5000 - this.field2171;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2164.write(this.field2170, var3, var4);
                    } catch (IOException var12) {
                        this.field2173 = true;
                    }
                    this.field2171 = (this.field2171 + var4) % 5000;
                    try {
                        if (this.field2171 == this.field2166) {
                            this.field2164.flush();
                        }
                    } catch (IOException var11) {
                        this.field2173 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2165 != null) {
                        this.field2165.close();
                    }
                    if (this.field2164 != null) {
                        this.field2164.close();
                    }
                    if (this.field2172 != null) {
                        this.field2172.close();
                    }
                } catch (IOException var10) {
                }
                this.field2170 = null;
                break;
            }
        } catch (Exception var15) {
            class148.method2604((String) null, var15);
        }
    }
}
