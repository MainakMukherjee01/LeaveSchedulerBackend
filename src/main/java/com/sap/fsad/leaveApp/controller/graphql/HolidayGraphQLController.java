package com.sap.fsad.leaveApp.controller.graphql;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.sap.fsad.leaveApp.model.Holiday;

@Controller
public class HolidayGraphQLController {

    // Query Resolvers
    @QueryMapping
    public List<Holiday> getAllHolidays() {
        // TODO: Replace with holidayService.getAllHolidays() when service is implemented
        return mockGetAllHolidays();
    }

    @QueryMapping
    public Holiday getHolidayById(@Argument Long id) {
        // TODO: Replace with holidayService.getHolidayById(id) when service is implemented
        return mockGetHolidayById(id);
    }

    @QueryMapping
    public List<Holiday> getHolidaysByYear(@Argument Integer year) {
        // TODO: Replace with holidayService.getHolidaysByYear(year) when service is implemented
        return mockGetHolidaysByYear(year);
    }

    @QueryMapping
    public List<Holiday> getHolidaysByMonthAndYear(@Argument Integer month, @Argument Integer year) {
        // TODO: Replace with holidayService.getHolidaysByMonthAndYear(month, year) when service is implemented
        return mockGetHolidaysByMonthAndYear(month, year);
    }

    @QueryMapping
    public List<Holiday> getCalendarView() {
        // TODO: Replace with holidayService.getAllHolidays() when service is implemented
        return mockGetAllHolidays();
    }

    // Mutation Resolvers
    @MutationMapping
    public Holiday createHoliday(@Argument Holiday input) {
        // TODO: Replace with holidayService.createHoliday(input) when service is implemented
        return mockCreateHoliday(input);
    }

    @MutationMapping
    public List<Holiday> createHolidays(@Argument List<Holiday> input) {
        // TODO: Replace with holidayService.createHolidays(input) when service is implemented
        return mockCreateHolidays(input);
    }

    @MutationMapping
    public Holiday updateHoliday(@Argument Long id, @Argument Holiday input) {
        // TODO: Replace with holidayService.updateHoliday(id, input) when service is implemented
        return mockUpdateHoliday(id, input);
    }

    @MutationMapping
    public String deleteHoliday(@Argument Long id) {
        // TODO: Replace with holidayService.deleteHoliday(id) when service is implemented
        return mockDeleteHoliday(id);
    }

    // ============= PLACEHOLDER MOCK METHODS - Replace with actual service calls =============
    // These methods mirror the same logic from HolidayController
    
    private Holiday mockCreateHoliday(Holiday holiday) {
        holiday.setId(System.currentTimeMillis());
        holiday.setCreatedAt(LocalDateTime.now());
        holiday.setUpdatedAt(LocalDateTime.now());
        return holiday;
    }
    
    private List<Holiday> mockCreateHolidays(List<Holiday> holidays) {
        LocalDateTime now = LocalDateTime.now();
        for (int i = 0; i < holidays.size(); i++) {
            holidays.get(i).setId(System.currentTimeMillis() + i);
            holidays.get(i).setCreatedAt(now);
            holidays.get(i).setUpdatedAt(now);
        }
        return holidays;
    }
    
    private List<Holiday> mockGetAllHolidays() {
        List<Holiday> holidays = new ArrayList<>();
        
        Holiday h1 = new Holiday();
        h1.setId(1L);
        h1.setName("New Year's Day");
        h1.setDate(LocalDate.of(2025, 1, 1));
        h1.setType("Public Holiday");
        h1.setDescription("First day of the Gregorian calendar year.");
        h1.setIsRecurring(true);
        h1.setCreatedAt(LocalDateTime.parse("2025-11-22T03:53:43.190416"));
        h1.setUpdatedAt(LocalDateTime.parse("2025-11-22T03:53:43.190416"));
        holidays.add(h1);

        Holiday h2 = new Holiday();
        h2.setId(2L);
        h2.setName("Republic Day");
        h2.setDate(LocalDate.of(2025, 1, 26));
        h2.setType("Public Holiday");
        h2.setDescription("National holiday celebrating the Constitution.");
        h2.setIsRecurring(true);
        h2.setCreatedAt(LocalDateTime.parse("2025-11-22T03:53:43.346528"));
        h2.setUpdatedAt(LocalDateTime.parse("2025-11-22T03:53:43.346528"));
        holidays.add(h2);

        Holiday h3 = new Holiday();
        h3.setId(3L);
        h3.setName("Vasant Panchami");
        h3.setDate(LocalDate.of(2025, 2, 1));
        h3.setType("Festival");
        h3.setDescription("Celebration of Saraswati Puja.");
        h3.setIsRecurring(true);
        h3.setCreatedAt(LocalDateTime.parse("2025-11-22T03:53:43.497286"));
        h3.setUpdatedAt(LocalDateTime.parse("2025-11-22T03:53:43.497286"));
        holidays.add(h3);

        Holiday h4 = new Holiday();
        h4.setId(4L);
        h4.setName("Maha Shivaratri");
        h4.setDate(LocalDate.of(2025, 2, 26));
        h4.setType("Festival");
        h4.setDescription("Hindu festival honoring Lord Shiva.");
        h4.setIsRecurring(true);
        h4.setCreatedAt(LocalDateTime.parse("2025-11-22T03:53:43.650178"));
        h4.setUpdatedAt(LocalDateTime.parse("2025-11-22T03:53:43.650178"));
        holidays.add(h4);

        Holiday h5 = new Holiday();
        h5.setId(5L);
        h5.setName("Holi");
        h5.setDate(LocalDate.of(2025, 3, 14));
        h5.setType("Festival");
        h5.setDescription("Festival of colors celebrated across India.");
        h5.setIsRecurring(true);
        h5.setCreatedAt(LocalDateTime.parse("2025-11-22T03:53:43.801322"));
        h5.setUpdatedAt(LocalDateTime.parse("2025-11-22T03:53:43.801322"));
        holidays.add(h5);

        Holiday h6 = new Holiday();
        h6.setId(6L);
        h6.setName("Good Friday");
        h6.setDate(LocalDate.of(2025, 4, 18));
        h6.setType("Public Holiday");
        h6.setDescription("Christian holiday commemorating the crucifixion.");
        h6.setIsRecurring(true);
        h6.setCreatedAt(LocalDateTime.parse("2025-11-22T03:53:43.966568"));
        h6.setUpdatedAt(LocalDateTime.parse("2025-11-22T03:53:43.966568"));
        holidays.add(h6);

        Holiday h7 = new Holiday();
        h7.setId(7L);
        h7.setName("Eid al-Fitr");
        h7.setDate(LocalDate.of(2025, 3, 31));
        h7.setType("Religious Holiday");
        h7.setDescription("Marks the end of Ramadan fasting.");
        h7.setIsRecurring(true);
        h7.setCreatedAt(LocalDateTime.parse("2025-11-22T03:53:44.206537"));
        h7.setUpdatedAt(LocalDateTime.parse("2025-11-22T03:53:44.206537"));
        holidays.add(h7);

        Holiday h8 = new Holiday();
        h8.setId(8L);
        h8.setName("May Day");
        h8.setDate(LocalDate.of(2025, 5, 1));
        h8.setType("Public Holiday");
        h8.setDescription("International Workers' Day.");
        h8.setIsRecurring(true);
        h8.setCreatedAt(LocalDateTime.parse("2025-11-22T03:53:44.363573"));
        h8.setUpdatedAt(LocalDateTime.parse("2025-11-22T03:53:44.363573"));
        holidays.add(h8);

        Holiday h9 = new Holiday();
        h9.setId(9L);
        h9.setName("Buddha Purnima");
        h9.setDate(LocalDate.of(2025, 5, 12));
        h9.setType("Festival");
        h9.setDescription("Celebration of the birth of Gautama Buddha.");
        h9.setIsRecurring(true);
        h9.setCreatedAt(LocalDateTime.parse("2025-11-22T03:53:44.514459"));
        h9.setUpdatedAt(LocalDateTime.parse("2025-11-22T03:53:44.514459"));
        holidays.add(h9);

        Holiday h10 = new Holiday();
        h10.setId(10L);
        h10.setName("Bakrid (Eid al-Adha)");
        h10.setDate(LocalDate.of(2025, 6, 7));
        h10.setType("Religious Holiday");
        h10.setDescription("Festival of sacrifice.");
        h10.setIsRecurring(true);
        h10.setCreatedAt(LocalDateTime.parse("2025-11-22T03:53:44.665264"));
        h10.setUpdatedAt(LocalDateTime.parse("2025-11-22T03:53:44.665264"));
        holidays.add(h10);

        Holiday h11 = new Holiday();
        h11.setId(11L);
        h11.setName("Muharram");
        h11.setDate(LocalDate.of(2025, 7, 5));
        h11.setType("Religious Holiday");
        h11.setDescription("Islamic New Year observance.");
        h11.setIsRecurring(true);
        h11.setCreatedAt(LocalDateTime.parse("2025-11-22T03:53:44.817116"));
        h11.setUpdatedAt(LocalDateTime.parse("2025-11-22T03:53:44.817116"));
        holidays.add(h11);

        Holiday h12 = new Holiday();
        h12.setId(12L);
        h12.setName("Independence Day");
        h12.setDate(LocalDate.of(2025, 8, 15));
        h12.setType("Public Holiday");
        h12.setDescription("National holiday celebrating Indian independence.");
        h12.setIsRecurring(true);
        h12.setCreatedAt(LocalDateTime.parse("2025-11-22T03:53:44.966546"));
        h12.setUpdatedAt(LocalDateTime.parse("2025-11-22T03:53:44.966546"));
        holidays.add(h12);

        Holiday h13 = new Holiday();
        h13.setId(13L);
        h13.setName("Janmashtami");
        h13.setDate(LocalDate.of(2025, 8, 16));
        h13.setType("Festival");
        h13.setDescription("Celebration of Lord Krishna’s birth.");
        h13.setIsRecurring(true);
        h13.setCreatedAt(LocalDateTime.parse("2025-11-22T03:53:45.12556"));
        h13.setUpdatedAt(LocalDateTime.parse("2025-11-22T03:53:45.12556"));
        holidays.add(h13);

        Holiday h14 = new Holiday();
        h14.setId(14L);
        h14.setName("Ganesh Chaturthi");
        h14.setDate(LocalDate.of(2025, 8, 27));
        h14.setType("Festival");
        h14.setDescription("Festival celebrating Lord Ganesha.");
        h14.setIsRecurring(true);
        h14.setCreatedAt(LocalDateTime.parse("2025-11-22T03:53:45.27962"));
        h14.setUpdatedAt(LocalDateTime.parse("2025-11-22T03:53:45.27962"));
        holidays.add(h14);

        Holiday h15 = new Holiday();
        h15.setId(15L);
        h15.setName("Gandhi Jayanti");
        h15.setDate(LocalDate.of(2025, 10, 2));
        h15.setType("Public Holiday");
        h15.setDescription("Birth anniversary of Mahatma Gandhi.");
        h15.setIsRecurring(true);
        h15.setCreatedAt(LocalDateTime.parse("2025-11-22T03:53:45.439482"));
        h15.setUpdatedAt(LocalDateTime.parse("2025-11-22T03:53:45.439482"));
        holidays.add(h15);

        Holiday h16 = new Holiday();
        h16.setId(16L);
        h16.setName("Diwali");
        h16.setDate(LocalDate.of(2025, 10, 20));
        h16.setType("Festival");
        h16.setDescription("Festival of lights celebrated across India.");
        h16.setIsRecurring(true);
        h16.setCreatedAt(LocalDateTime.parse("2025-11-22T03:53:45.591656"));
        h16.setUpdatedAt(LocalDateTime.parse("2025-11-22T03:53:45.591656"));
        holidays.add(h16);

        Holiday h17 = new Holiday();
        h17.setId(17L);
        h17.setName("Bhai Dooj");
        h17.setDate(LocalDate.of(2025, 10, 22));
        h17.setType("Festival");
        h17.setDescription("Festival celebrating sibling bonds.");
        h17.setIsRecurring(true);
        h17.setCreatedAt(LocalDateTime.parse("2025-11-22T03:53:45.745355"));
        h17.setUpdatedAt(LocalDateTime.parse("2025-11-22T03:53:45.745355"));
        holidays.add(h17);

        Holiday h18 = new Holiday();
        h18.setId(18L);
        h18.setName("Christmas");
        h18.setDate(LocalDate.of(2025, 12, 25));
        h18.setType("Public Holiday");
        h18.setDescription("Christian holiday celebrating the birth of Jesus Christ.");
        h18.setIsRecurring(true);
        h18.setCreatedAt(LocalDateTime.parse("2025-11-22T03:53:45.928098"));
        h18.setUpdatedAt(LocalDateTime.parse("2025-11-22T03:53:45.928098"));
        holidays.add(h18);

        Holiday h19 = new Holiday();
        h19.setId(19L);
        h19.setName("Pongal / Makar Sankranthi");
        h19.setDate(LocalDate.of(2025, 1, 14));
        h19.setType("Public Holiday");
        h19.setDescription("Public holiday celebrated across India.");
        h19.setIsRecurring(true);
        h19.setCreatedAt(LocalDateTime.parse("2025-11-22T04:33:31.752412"));
        h19.setUpdatedAt(LocalDateTime.parse("2025-11-22T04:33:31.752412"));
        holidays.add(h19);

        Holiday h20 = new Holiday();
        h20.setId(20L);
        h20.setName("Maha Navami");
        h20.setDate(LocalDate.of(2025, 10, 1));
        h20.setType("Festival");
        h20.setDescription("Ninth day of Navratri celebrations.");
        h20.setIsRecurring(true);
        h20.setCreatedAt(LocalDateTime.parse("2025-11-22T04:33:32.332717"));
        h20.setUpdatedAt(LocalDateTime.parse("2025-11-22T04:33:32.332717"));
        holidays.add(h20);

        Holiday h21 = new Holiday();
        h21.setId(21L);
        h21.setName("Telangana State Formation Day");
        h21.setDate(LocalDate.of(2025, 6, 2));
        h21.setType("Public Holiday");
        h21.setDescription("Commemoration of the formation of the state of Telangana.");
        h21.setIsRecurring(true);
        h21.setCreatedAt(LocalDateTime.parse("2025-11-22T04:33:32.531086"));
        h21.setUpdatedAt(LocalDateTime.parse("2025-11-22T04:33:32.531086"));
        holidays.add(h21);
        
        return holidays;
    }
    
    private Holiday mockGetHolidayById(Long id) {
        Holiday holiday = new Holiday();
        holiday.setId(id);
        holiday.setName("Sample Holiday " + id);
        holiday.setDate(LocalDate.of(2024, 1, 1));
        holiday.setType("National");
        holiday.setDescription("Sample holiday with ID: " + id);
        holiday.setIsRecurring(false);
        holiday.setCreatedAt(LocalDateTime.now());
        holiday.setUpdatedAt(LocalDateTime.now());
        return holiday;
    }
    
    private List<Holiday> mockGetHolidaysByYear(Integer year) {
        List<Holiday> holidays = new ArrayList<>();
        
        Holiday holiday1 = new Holiday();
        holiday1.setId(1L);
        holiday1.setName("Holiday 1 in " + year);
        holiday1.setDate(LocalDate.of(year, 6, 15));
        holiday1.setType("National");
        holiday1.setDescription("First holiday of " + year);
        holiday1.setIsRecurring(true);
        holiday1.setCreatedAt(LocalDateTime.now());
        holiday1.setUpdatedAt(LocalDateTime.now());
        holidays.add(holiday1);
        
        Holiday holiday2 = new Holiday();
        holiday2.setId(2L);
        holiday2.setName("Holiday 2 in " + year);
        holiday2.setDate(LocalDate.of(year, 9, 10));
        holiday2.setType("Organizational");
        holiday2.setDescription("Second holiday of " + year);
        holiday2.setIsRecurring(false);
        holiday2.setCreatedAt(LocalDateTime.now());
        holiday2.setUpdatedAt(LocalDateTime.now());
        holidays.add(holiday2);
        
        return holidays;
    }
    
    private List<Holiday> mockGetHolidaysByMonthAndYear(Integer month, Integer year) {
        List<Holiday> holidays = new ArrayList<>();
        
        Holiday holiday = new Holiday();
        holiday.setId(1L);
        holiday.setName("Holiday in " + month + "/" + year);
        holiday.setDate(LocalDate.of(year, month, 15));
        holiday.setType("National");
        holiday.setDescription("Holiday occurring in month " + month + " of year " + year);
        holiday.setIsRecurring(true);
        holiday.setCreatedAt(LocalDateTime.now());
        holiday.setUpdatedAt(LocalDateTime.now());
        holidays.add(holiday);
        
        return holidays;
    }
    
    private Holiday mockUpdateHoliday(Long id, Holiday holidayDetails) {
        holidayDetails.setId(id);
        holidayDetails.setUpdatedAt(LocalDateTime.now());
        if (holidayDetails.getCreatedAt() == null) {
            holidayDetails.setCreatedAt(LocalDateTime.now());
        }
        return holidayDetails;
    }
    
    private String mockDeleteHoliday(Long id) {
        return "Holiday " + id + " deleted successfully.";
    }
}
