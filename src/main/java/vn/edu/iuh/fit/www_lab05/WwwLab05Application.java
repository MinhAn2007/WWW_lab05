package vn.edu.iuh.fit.www_lab05;

import com.neovisionaries.i18n.CountryCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.edu.iuh.fit.www_lab05.backend.models.Address;
import vn.edu.iuh.fit.www_lab05.backend.models.Candidate;
import vn.edu.iuh.fit.www_lab05.backend.models.Company;
import vn.edu.iuh.fit.www_lab05.backend.models.Job;
import vn.edu.iuh.fit.www_lab05.backend.repositories.AddressRepository;
import vn.edu.iuh.fit.www_lab05.backend.repositories.CandidateRepository;
import vn.edu.iuh.fit.www_lab05.backend.repositories.CompanyRepository;
import vn.edu.iuh.fit.www_lab05.backend.repositories.JobRepository;

import java.time.LocalDate;
import java.util.Random;

@SpringBootApplication
public class WwwLab05Application {

    public static void main(String[] args) {
        SpringApplication.run(WwwLab05Application.class, args);
    }
    @Autowired
    private CandidateRepository candidateRepository;
    @Autowired
    private AddressRepository addressRepository;
//    @Bean
//    CommandLineRunner initData(){
//        return args -> {
//            Random rnd =new Random();
//            for (int i = 1; i < 1000; i++) {
//                Address add = new Address(rnd.nextInt(1,1000)+"","Quang Trung","HCM",
//                        rnd.nextInt(70000,80000)+"", CountryCode.VN );
//                addressRepository.save(add);
//
//                Candidate can=new Candidate("Name #"+i,
//                        LocalDate.of(1998,rnd.nextInt(1,13),rnd.nextInt(1,29)),
//                        add,
//                        rnd.nextLong(1111111111L,9999999999L)+"",
//                        "email_"+i+"@gmail.com");
//                candidateRepository.save(can);
//                System.out.println("Added: " +can);
//            }
//        };
//    }
//    @Bean
//    CommandLineRunner initData(CandidateRepository candidateRepository, CompanyRepository companyRepository, AddressRepository addressRepository, JobRepository jobRepository) {
//        return args -> {
//            for (int i = 1; i <= 20; i++) {
//                          Random rnd =new Random();
//                Address add = new Address(rnd.nextInt(1, 1000) + "", "Quang Trung", "HCM",
//                        rnd.nextInt(70000, 80000) + "", CountryCode.VN);
//                addressRepository.save(add);
//                Company company = new Company("Company #" + i);
//                company.setName("com #"+i);
//                company.setAbout("about "+ i);
//                company.setEmail("Email #"+ i);
//                company.setPhone("0123" + rnd.nextInt(10000,20000));
//                company.setAddress(add);
//                companyRepository.save(company);
//
//                Job job = new Job();
//                job.setName("Job #" + i);
//                job.setDescription("Description for Job #" + i);
//                job.setCompany(company);
//                jobRepository.save(job);
//
//                System.out.println("Added Job: " + job);
//            }
//        };
//    }

}
