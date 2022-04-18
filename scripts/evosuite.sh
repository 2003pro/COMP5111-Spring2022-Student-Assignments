EVO_JAR="/Users/zhangjipeng/COMP5111-Spring2022-Student-Assignments/lib/evosuite-1.2.0.jar"
TARGET="/Users/zhangjipeng/COMP5111-Spring2022-Student-Assignments/src/main/java"
ROOT_DIR="/Users/zhangjipeng/COMP5111-Spring2022-Student-Assignments/"
i="2"

java -jar ${EVO_JAR} -class comp5111.assignment.cut.Subject \
   -projectCP=${TARGET} \
   -criterion branch \
   -Dsearch_budget=40 \
   -Dnum_random_tests=50 \
   -Dnum_tests=5 \
   -Dmax_size=1000 \
   -Dstring_length=50 \
   -seed $i
