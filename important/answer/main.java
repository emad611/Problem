package com.java;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // إنشاء Scanner لقراءة البيانات من المستخدم
        Scanner sc = new Scanner(System.in);

        // نطلب من المستخدم يدخل عدد الروابط (عدد الـ key/value pairs)
        System.out.println("pls enter a number of links");
        int linksize = sc.nextInt();

        // إنشاء Map بحيث المفتاح String والقيمة List<String>
        // الهدف: كل مفتاح يكون له لستة قيم مرتبطة به
        Map<String, List<String>> map = new HashMap<>();

        // حلقة بتتكرر بعدد الروابط اللي المستخدم كتبها
        while (linksize > 0) {

            // نطلب من المستخدم يدخل المفتاح
            System.out.println("pls enter a key");
            String key = sc.next();

            // نطلب من المستخدم يدخل القيمة المرتبطة بالمفتاح
            System.out.println("pls enter a value");
            String value = sc.next();

            // في الأول نجهّز لستة جديدة فاضية
            List<String> links = new ArrayList<>();

            // لو المفتاح موجود بالفعل في الـ Map
            if (map.containsKey(key)) {
                // هات اللستة القديمة المرتبطة بهذا المفتاح
                links = map.get(key);
            }

            // أضف القيمة الجديدة إلى اللستة (سواء لستة جديدة أو قديمة)
            links.add(value);

            // رجّع اللستة للمفتاح داخل الـ Map
            // لو المفتاح جديد هيتسجل لأول مرة
            // لو المفتاح كان موجود هيتحدّث بقيمته الجديدة
            map.put(key, links);

            // نقلل العداد علشان نقرب من نهاية اللوب
            linksize--;
        }

        // طباعة محتويات الـ Map كاملة بعد انتهاء الإدخال
        System.out.println(map);

        // إغلاق الـ Scanner
        sc.close();
    }
}
